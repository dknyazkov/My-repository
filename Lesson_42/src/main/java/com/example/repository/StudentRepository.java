
package com.example.repository;

import com.example.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID>, JpaSpecificationExecutor<StudentEntity> {
    List<StudentEntity> findAllByOrderByIdsDesc();

    @Modifying
    @Query(value = "update StudentEntity set ids=ids+1 where id=:id")
    void increaseOrder(UUID id);

    @Modifying
    @Query(value = "update StudentEntity set ids=ids-1 where id=:id")
    void decreaseOrder(UUID id);


}