package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.Dokument;

import java.util.List;

public interface DokumentServiceInterface {

    Dokument findOne(Long dokument_id);
    List<Dokument> findAll();
    Dokument save(Dokument dokument);
    void remove(Long dokument_id);
}
