package com.example.lesson50_.service;

import com.example.lesson50_.repository.PersonRepository;
import com.example.lesson50_.domain.PermissionsEntity;
import com.example.lesson50_.domain.PersonDTO;
import com.example.lesson50_.domain.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void savePerson(PersonDTO personDTO) {
        PersonEntity person = PersonEntity.builder()
                .username(personDTO.getUsername())
                .password(passwordEncoder.encode(personDTO.getPassword()))
                .isEnabled(true)
                .build();

        String permissions = personDTO.getPermissions();
        String[] split = permissions.split(",");
        List<PermissionsEntity> collect = Arrays.stream(split)
                .map(PermissionsEntity::new)
                .peek(permissionsEntity -> permissionsEntity.setPerson(person))
                .collect(Collectors.toList());

        person.setPermissions(collect);


        repository.save(person);

    }
}
