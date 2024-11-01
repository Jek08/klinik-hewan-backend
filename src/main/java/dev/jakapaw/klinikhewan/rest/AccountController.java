package dev.jakapaw.klinikhewan.rest;

import dev.jakapaw.klinikhewan.data.model.PasienHewan;
import dev.jakapaw.klinikhewan.data.model.PemilikHewan;
import dev.jakapaw.klinikhewan.rest.dto.DaftarBaru;
import dev.jakapaw.klinikhewan.service.AccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    AccountManager accountManager;

    @PostMapping("/daftar")
    public ResponseEntity<String> daftarPasienBaru(@RequestBody DaftarBaru data) {
        // service create pasien baru
        try {
            PemilikHewan pemilikHewan = data.getPemilik();
            List<PasienHewan> pasienHewan = data.getHewan();
            accountManager.createPasienBaru(pemilikHewan, pasienHewan);
            return ResponseEntity.ok("Berhasil");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/pemilik")
    public ResponseEntity<String> ubahDataPemilik(@RequestBody PemilikHewan data) {
        try {
            accountManager.updatePemilik(data);
            return ResponseEntity.ok("Berhasil");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/hewan/hapus/{id}")
    public ResponseEntity<String> hapusDataHewan(@PathVariable Integer id) {
        try {
            accountManager.deleteHewan(id);
            return ResponseEntity.ok("Berhasil");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/hewan")
    public ResponseEntity<List<PasienHewan>> getAllHewan() {
        try {
            List<PasienHewan> hewanList = accountManager.readAllHewan();
            return ResponseEntity.ok(hewanList);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
