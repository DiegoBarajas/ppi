package com.devsau.students.repositories;

import com.devsau.students.models.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel,Long> {

}
