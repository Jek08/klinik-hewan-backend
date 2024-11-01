package dev.jakapaw.klinikhewan.data.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class RiwayatPeriksa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRiwayat;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "idHewan")
    private Set<PasienHewan> hewan;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "idDokter")
    private Set<DokterHewan> dokter;

    private String diagnosa;
    private String keterangan;

    public RiwayatPeriksa() {
    }
}
