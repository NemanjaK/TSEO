package eObrazovanje.eObrazovanje.repository;

import eObrazovanje.eObrazovanje.entity.Dokument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DokumentRepository extends JpaRepository<Dokument, Long> {

    List<Dokument> findAllByStudentId(Long id);
    Dokument findAllByNaziv(String naziv);
}
