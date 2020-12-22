package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.RokDTO;
import eObrazovanje.eObrazovanje.dto.StudentDTO;
import eObrazovanje.eObrazovanje.entity.Rok;
import eObrazovanje.eObrazovanje.entity.Student;
import eObrazovanje.eObrazovanje.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/studenti")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<StudentDTO>> getStudenti() {
        List<Student> studenti = studentService.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<StudentDTO>();
        for(Student s : studenti) {
            studentDTOS.add(new StudentDTO(s));
        }
        return new ResponseEntity<List<StudentDTO>>(studentDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable("id") Long id) {
        Student student = studentService.findOne(id);
        if(student == null) {
            return new ResponseEntity<StudentDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<StudentDTO>(new StudentDTO(student), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO) {
        Student student = new Student();

        student.setAdresa(studentDTO.getAdresa());
        student.setBrojIndeksa(studentDTO.getBrojIndeksa());
        student.setBrojTelefona(studentDTO.getBrojTelefona());
        student.setJmbg(studentDTO.getJmbg());
        student.setStanje(studentDTO.getStanje());
        student.setTekuciRacun(studentDTO.getTekuciRacun());
        student.setUser(studentDTO.getUser());
        student = studentService.save(student);
        return new ResponseEntity<StudentDTO>(new StudentDTO(student), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable("id") Long id) {
        Student student = studentService.findOne(id);
        if(student == null) {
            return new ResponseEntity<StudentDTO>(HttpStatus.NOT_FOUND);
        }
        student.setAdresa(studentDTO.getAdresa());
        student.setBrojIndeksa(studentDTO.getBrojIndeksa());
        student.setBrojTelefona(studentDTO.getBrojTelefona());
        student.setJmbg(studentDTO.getJmbg());
        student.setStanje(studentDTO.getStanje());
        student.setTekuciRacun(studentDTO.getTekuciRacun());
        student.setUser(studentDTO.getUser());
        student = studentService.save(student);
        return new ResponseEntity<StudentDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        Student student = studentService.findOne(id);
        if(student != null) {
            studentService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
