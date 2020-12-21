package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Student;

import java.util.List;

public interface StudentServiceInterface {

    Student findOne(Long student_id);
    List<Student> findAll();
    Student save(Student student);
    void remove(Long student_id);
}
