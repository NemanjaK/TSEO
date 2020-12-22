package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.UplataDTO;
import eObrazovanje.eObrazovanje.entity.Uplata;
import eObrazovanje.eObrazovanje.service.UplataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/uplate")
public class UplataController {

    @Autowired
    UplataService uplataService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<UplataDTO>> getUplate() {
        List<Uplata> uplate = uplataService.findAll();
        List<UplataDTO> uplataDTOS = new ArrayList<UplataDTO>();
        for(Uplata u : uplate) {
            uplataDTOS.add(new UplataDTO(u));
        }
        return new ResponseEntity<List<UplataDTO>>(uplataDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<UplataDTO> getUplata(@PathVariable("id") Long id) {
        Uplata uplata = uplataService.findOne(id);
        if(uplata == null) {
            return new ResponseEntity<UplataDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UplataDTO>(new UplataDTO(uplata), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<UplataDTO> addUplata(@RequestBody UplataDTO uplataDTO) {
        Uplata uplata = new Uplata();

        uplata.setDatum(uplataDTO.getDatum());
        uplata.setIznos(uplataDTO.getIznos());
        uplata.setPozivNaBroj(uplata.getPozivNaBroj());
        uplata.setRacunPrimaoca(uplata.getRacunPrimaoca());
        uplata.setSvrhaUplate(uplata.getSvrhaUplate());
        uplata.setStudent(uplata.getStudent());
        uplata = uplataService.save(uplata);
        return new ResponseEntity<UplataDTO>(new UplataDTO(uplata), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<UplataDTO> updateUplata(@RequestBody UplataDTO uplataDTO, @PathVariable("id") Long id) {
        Uplata uplata = uplataService.findOne(id);
        if(uplata == null) {
            return new ResponseEntity<UplataDTO>(HttpStatus.NOT_FOUND);
        }
        uplata.setDatum(uplataDTO.getDatum());
        uplata.setIznos(uplataDTO.getIznos());
        uplata.setPozivNaBroj(uplata.getPozivNaBroj());
        uplata.setRacunPrimaoca(uplata.getRacunPrimaoca());
        uplata.setSvrhaUplate(uplata.getSvrhaUplate());
        uplata.setStudent(uplata.getStudent());

        uplata = uplataService.save(uplata);
        return new ResponseEntity<UplataDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteUplata(@PathVariable Long id) {
        Uplata uplata = uplataService.findOne(id);
        if(uplata != null) {
            uplataService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
