package eObrazovanje.eObrazovanje.repository;

import eObrazovanje.eObrazovanje.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
