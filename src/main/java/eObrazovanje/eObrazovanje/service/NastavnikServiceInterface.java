package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Nastavnik;

import java.util.List;

public interface NastavnikServiceInterface {

    Nastavnik findOne(Long nastavnik_id);
    List<Nastavnik> findAll();
    Nastavnik save(Nastavnik nastavnik);
    void remove(Long nastavnik_id);
}
