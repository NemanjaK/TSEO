package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Rok;

import java.util.List;

public interface RokServiceInterface {

    Rok findOne(Long rok_id);
    List<Rok> findAll();
    Rok save(Rok rok);
    void remove(Long rok_id);
}
