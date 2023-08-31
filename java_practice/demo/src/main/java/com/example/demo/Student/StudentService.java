package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {

        if (studentRepository.findUserByEmail(student.getEmail()).isPresent()) {
            throw new IllegalStateException("email already used");
        } else {
            studentRepository.save(student);
        }

    }

    public void deleteStudent(Long Id) {
        if (studentRepository.findById(Id).isPresent()) {
            studentRepository.deleteById(Id);
        } else {
            throw new IllegalStateException("user doesn't exixst!It cannot be deleted!");
        }
    }

    
    @Transactional
    public void updateStudent(Long Id, String name, String email) throws IllegalAccessException {

        Student student = studentRepository
                .findById(Id)
                .orElseThrow(() -> new IllegalAccessException("the user you are trying to update does not exist"));

        if(student.getName()!=name && name != null)
        {
            student.setName(name);
        }

        if(student.getEmail()!=email && email != null)
        {
            student.setEmail(email);
        }

    }

}
