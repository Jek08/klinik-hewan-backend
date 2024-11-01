package dev.jakapaw.klinikhewan.service;

import dev.jakapaw.klinikhewan.data.model.PasienHewan;
import dev.jakapaw.klinikhewan.data.model.PemilikHewan;
import dev.jakapaw.klinikhewan.data.repository.PasienHewanRepository;
import dev.jakapaw.klinikhewan.data.repository.PemilikHewanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AccountManager {

    @Autowired
    PemilikHewanRepository pemilikHewanRepository;
    @Autowired
    PasienHewanRepository pasienHewanRepository;

    public void createPasienBaru(PemilikHewan pemilik, List<PasienHewan> hewanList) {
        pemilikHewanRepository.save(pemilik);
        hewanList.forEach(hewan -> {
                    hewan.setPemilikHewan(pemilik);
                });
        pasienHewanRepository.saveAll(hewanList);
    }

    public void updatePemilik(PemilikHewan data) {
        pemilikHewanRepository.save(data);
    }

    public void deleteHewan(int id) {
        pasienHewanRepository.deleteById(id);
    }

    public List<PasienHewan> readAllHewan() {
        List<PasienHewan> result = new ArrayList<>();
        pasienHewanRepository.findAll().forEach(result::add);
        return result;
    }
}
