package com.example.lesson50_.service;

import com.example.lesson50_.repository.PersonRepository;
import com.example.lesson50_.exception.PersonErrorException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DBUserDetailService implements UserDetailsService {
    private final PersonRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username).orElseThrow(PersonErrorException::new);

    }
}
