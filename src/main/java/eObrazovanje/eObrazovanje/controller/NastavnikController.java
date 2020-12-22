package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.NastavnikDTO;
import eObrazovanje.eObrazovanje.entity.Nastavnik;
import eObrazovanje.eObrazovanje.service.NastavnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/nastavnici")
public class NastavnikController {

    @Autowired
    NastavnikService nastavnikService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<NastavnikDTO>> getNastavnik() {
        List<Nastavnik> nastavnici = nastavnikService.findAll();
        List<NastavnikDTO> nastavnikDTOS = new ArrayList<NastavnikDTO>();
        for(Nastavnik n : nastavnici) {
            nastavnikDTOS.add(new NastavnikDTO(n));
        }
        return new ResponseEntity<List<NastavnikDTO>>(nastavnikDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<NastavnikDTO> getNastavnik(@PathVariable("id") Long id) {
        Nastavnik nastavnik = nastavnikService.findOne(id);
        if(nastavnik == null) {
            return new ResponseEntity<NastavnikDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<NastavnikDTO>(new NastavnikDTO(nastavnik), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<NastavnikDTO> addNastavnik(@RequestBody NastavnikDTO nastavnikDTO) {
        Nastavnik nastavnik = new Nastavnik();

        nastavnik.setAdresa(nastavnikDTO.getAdresa());
        nastavnik.setJmbg(nastavnikDTO.getJmbg());
        nastavnik.setUlogaNastavnika(nastavnikDTO.getUlogaNastavnika());
        nastavnik.setUser(nastavnikDTO.getUser());
        nastavnik.setPredmeti(nastavnikDTO.getPredmeti());
        nastavnik.setPredmeti(nastavnikDTO.getPredmeti());
        nastavnik = nastavnikService.save(nastavnik);
        return new ResponseEntity<NastavnikDTO>(new NastavnikDTO(nastavnik), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<NastavnikDTO> updateNastavnik(@RequestBody NastavnikDTO nastavnikDTO, @PathVariable("id") Long id) {
        Nastavnik nastavnik = nastavnikService.findOne(id);
        if(nastavnik == null) {
            return new ResponseEntity<NastavnikDTO>(HttpStatus.NOT_FOUND);
        }
        nastavnik.setAdresa(nastavnikDTO.getAdresa());
        nastavnik.setJmbg(nastavnikDTO.getJmbg());
        nastavnik.setUlogaNastavnika(nastavnikDTO.getUlogaNastavnika());
        nastavnik.setUser(nastavnikDTO.getUser());
        nastavnik.setPredmeti(nastavnikDTO.getPredmeti());
        nastavnik.setPredmeti(nastavnikDTO.getPredmeti());
        nastavnik = nastavnikService.save(nastavnik);
        return new ResponseEntity<NastavnikDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteNastavnik(@PathVariable Long id) {
        Nastavnik nastavnik = nastavnikService.findOne(id);
        if(nastavnik != null) {
            nastavnikService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
