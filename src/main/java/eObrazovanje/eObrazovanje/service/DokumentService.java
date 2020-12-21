package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Dokument;
import eObrazovanje.eObrazovanje.repository.DokumentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DokumentService implements DokumentServiceInterface{

    @Autowired
    private DokumentRepository dokumentRepository;

    public List<Dokument> getByStudent(Long id) {
        return dokumentRepository.findAllByStudentId(id);
    }

    public Dokument findByNaziv (String naziv) {
        return dokumentRepository.findAllByNaziv(naziv);
    }

    @Override
    public Dokument findOne(Long dokument_id) {
        return dokumentRepository.findById(dokument_id).get();
    }

    @Override
    public List<Dokument> findAll() {
        return dokumentRepository.findAll();
    }

    @Override
    public Dokument save(Dokument dokument) {
        return dokumentRepository.save(dokument);
    }

    @Override
    public void remove(Long dokument_id) {
        dokumentRepository.deleteById(dokument_id);
    }
}
