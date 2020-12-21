package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.RokDTO;
import eObrazovanje.eObrazovanje.entity.Rok;
import eObrazovanje.eObrazovanje.service.RokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/rokovi")
public class RokController {

    @Autowired
    RokService rokService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<RokDTO>> getRokovi() {
        List<Rok> rokovi = rokService.findAll();
        List<RokDTO> rokDTOS = new ArrayList<RokDTO>();
        for(Rok r : rokovi) {
            rokDTOS.add(new RokDTO(r));
        }
        return new ResponseEntity<List<RokDTO>>(rokDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<RokDTO> getRok(@PathVariable("id") Long id) {
        Rok rok = rokService.findOne(id);
        if(rok == null) {
            return new ResponseEntity<RokDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<RokDTO>(new RokDTO(rok), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<RokDTO> addRok(@RequestBody RokDTO rokDTO) {
        Rok rok = new Rok();

        rok.setNaziv(rokDTO.getNaziv());
        rok.setIspiti(rokDTO.getIspiti());
        rok = rokService.save(rok);
        return new ResponseEntity<RokDTO>(new RokDTO(rok), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<RokDTO> updateRok(@RequestBody RokDTO rokDTO, @PathVariable("id") Long id) {
        Rok rok = rokService.findOne(id);
        if(rok == null) {
            return new ResponseEntity<RokDTO>(HttpStatus.NOT_FOUND);
        }
        rok.setNaziv(rokDTO.getNaziv());
        rok.setIspiti(rokDTO.getIspiti());

        rok = rokService.save(rok);
        return new ResponseEntity<RokDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteRok(@PathVariable Long id) {
        Rok rok = rokService.findOne(id);
        if(rok != null) {
            rokService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
