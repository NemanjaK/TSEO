package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Nastavnik;
import eObrazovanje.eObrazovanje.repository.NastavnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NastavnikService implements NastavnikServiceInterface{

    @Autowired
    NastavnikRepository nastavnikRepository;

    @Override
    public Nastavnik findOne(Long nastavnik_id) {
        return nastavnikRepository.findById(nastavnik_id).get();
    }

    @Override
    public List<Nastavnik> findAll() {
        return nastavnikRepository.findAll();
    }

    @Override
    public Nastavnik save(Nastavnik nastavnik) {
        return nastavnikRepository.save(nastavnik);
    }

    @Override
    public void remove(Long nastavnik_id) {
        nastavnikRepository.deleteById(nastavnik_id);
    }
}
