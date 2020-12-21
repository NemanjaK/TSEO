package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Uplata;
import eObrazovanje.eObrazovanje.repository.UplataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UplataService implements UplataServiceInterface{

    @Autowired
    UplataRepository uplataRepository;


    @Override
    public Uplata findOne(Long uplata_id) {
        return uplataRepository.findById(uplata_id).get();
    }

    @Override
    public List<Uplata> findAll() {
        return uplataRepository.findAll();
    }

    @Override
    public Uplata save(Uplata uplata) {
        return uplataRepository.save(uplata);
    }

    @Override
    public void remove(Long uplata_id) {
        uplataRepository.deleteById(uplata_id);
    }
}
