package dev.jakapaw.klinikhewan.data.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class PasienHewan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHewan;
    private String namaHewan;
    private Integer usia;
    private Integer beratBadan;
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "id_pemilik")
    private PemilikHewan pemilikHewan;

    @OneToMany(mappedBy = "idRiwayat")
    private Set<RiwayatPeriksa> riwayatPeriksa;

    public PasienHewan() {
    }
}
