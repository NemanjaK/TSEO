package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Uplata;

import java.util.List;

public interface UplataServiceInterface {

    Uplata findOne(Long uplata_id);
    List<Uplata> findAll();
    Uplata save(Uplata uplata);
    void remove(Long uplata_id);
}
