package com.example.lesson50_.repository;

import com.example.lesson50_.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    Optional<PersonEntity> findByUsername(String username);
}
