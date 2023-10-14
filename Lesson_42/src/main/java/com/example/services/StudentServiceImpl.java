


package com.example.services;

import com.example.domain.StudentDTO;
import com.example.domain.StudentEntity;
import com.example.domain.University;
import com.example.repository.StudentRepository;
import com.example.services.StudentMapper;
import com.example.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper mapper;
    private final StudentRepository repository;

    @Override
    public void save(StudentDTO student) {
        StudentEntity entity = mapper.toEntity(student);
        repository.save(entity);

    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> all = repository.findAll();
        return mapper.toListDTO(all);
    }

    public List<StudentDTO> orderBy() {
        return mapper.toListDTO(repository.findAllByOrderByIdsDesc());
    }

    @Transactional
    @Override
    public void increase(UUID id) {
        repository.increaseOrder(id);

    }

    @Transactional
    @Override
    public void decrease(UUID id) {
        repository.decreaseOrder(id);
    }

    @Override
    public List<StudentDTO> findByText(StudentSearchService studentSearchService) {
        List<StudentEntity> all = repository.findAll(createSearchSpecification(studentSearchService));
        return mapper.toListDTO(all);
    }

    public Specification<StudentEntity> createSearchSpecification(StudentSearchService searchService) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            String name = searchService.getName();
            Integer age = searchService.getAge();
            University university = searchService.getUniversity();
            if (!name.isBlank()) {
                predicates.add(criteriaBuilder.equal(root.get("name"), name));

            }
            if (age != null) {
                predicates.add(criteriaBuilder.equal(root.get("age"), age));

            }

            if (university != null) {
                predicates.add(criteriaBuilder.equal(root.get("university"), university));

            }
            return criteriaBuilder.and(predicates.toArray(Predicate[]::new));
        };

    }

}


