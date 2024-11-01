package dev.jakapaw.klinikhewan.data.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Data
public class DokterHewan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDokter;

    private String nama;
    private String nomorHp;
    private String alamat;
    private ArrayList<LocalTime> jadwalPraktik;

    @OneToMany(mappedBy = "idRiwayat")
    private Set<RiwayatPeriksa> riwayatPeriksa;

    public DokterHewan() {
    }
}
