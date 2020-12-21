package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Student;
import eObrazovanje.eObrazovanje.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findOne(Long student_id) {
        return studentRepository.findById(student_id).get();
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void remove(Long student_id) {
        studentRepository.deleteById(student_id);
    }
}
