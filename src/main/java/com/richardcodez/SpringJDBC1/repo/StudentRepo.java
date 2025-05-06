package com.richardcodez.SpringJDBC1.repo;

import com.richardcodez.SpringJDBC1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // we can also use @Component
public class StudentRepo {
    public void save(Student s) {
        System.out.println("Added");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;

    }
}
