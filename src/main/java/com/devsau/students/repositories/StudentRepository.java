package com.devsau.students.repositories;

import com.devsau.students.models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long> {
    
}
