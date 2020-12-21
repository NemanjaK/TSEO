package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Rok;
import eObrazovanje.eObrazovanje.repository.RokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RokService implements RokServiceInterface{

    @Autowired
    RokRepository rokRepository;


    @Override
    public Rok findOne(Long rok_id) {
        return rokRepository.findById(rok_id).get();
    }

    @Override
    public List<Rok> findAll() {
        return rokRepository.findAll();
    }

    @Override
    public Rok save(Rok rok) {
        return rokRepository.save(rok);
    }

    @Override
    public void remove(Long rok_id) {
        rokRepository.deleteById(rok_id);
    }
}
