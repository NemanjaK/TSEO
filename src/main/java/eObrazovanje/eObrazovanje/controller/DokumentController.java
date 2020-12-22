package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.DokumentDTO;
import eObrazovanje.eObrazovanje.entity.Dokument;
import eObrazovanje.eObrazovanje.service.DokumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/dokumenti")
public class DokumentController {

    @Autowired
    DokumentService dokumentService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<DokumentDTO>> getDokumenti() {
        List<Dokument> dokumenti = dokumentService.findAll();
        List<DokumentDTO> dokumentDTOS = new ArrayList<DokumentDTO>();
        for(Dokument d : dokumenti) {
            dokumentDTOS.add(new DokumentDTO(d));
        }
        return new ResponseEntity<List<DokumentDTO>>(dokumentDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<DokumentDTO> getDokument(@PathVariable("id") Long id) {
        Dokument dokument = dokumentService.findOne(id);
        if(dokument == null) {
            return new ResponseEntity<DokumentDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<DokumentDTO>(new DokumentDTO(dokument), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<DokumentDTO> addDokument(@RequestBody DokumentDTO dokumentDTO) {
        Dokument dokument = new Dokument();

        dokument.setDatumDokumenta(dokumentDTO.getDatumDokumenta());
        dokument.setNaziv(dokumentDTO.getNaziv());
        dokument.setPutanja(dokumentDTO.getPutanja());
        dokument.setSadrzaj(dokumentDTO.getSadrzaj());
        dokument.setStudent(dokumentDTO.getStudent());
        dokument = dokumentService.save(dokument);
        return new ResponseEntity<DokumentDTO>(new DokumentDTO(dokument), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<DokumentDTO> updateDokument(@RequestBody DokumentDTO dokumentDTO, @PathVariable("id") Long id) {
        Dokument dokument = dokumentService.findOne(id);
        if(dokument == null) {
            return new ResponseEntity<DokumentDTO>(HttpStatus.NOT_FOUND);
        }
        dokument.setDatumDokumenta(dokumentDTO.getDatumDokumenta());
        dokument.setNaziv(dokumentDTO.getNaziv());
        dokument.setPutanja(dokumentDTO.getPutanja());
        dokument.setSadrzaj(dokumentDTO.getSadrzaj());
        dokument.setStudent(dokumentDTO.getStudent());;
        dokument = dokumentService.save(dokument);
        return new ResponseEntity<DokumentDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteDokument(@PathVariable Long id) {
        Dokument dokument = dokumentService.findOne(id);
        if(dokument != null) {
            dokumentService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
