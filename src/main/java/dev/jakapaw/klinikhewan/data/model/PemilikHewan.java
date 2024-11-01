package dev.jakapaw.klinikhewan.data.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class PemilikHewan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPemilik;

    private String nama;
    private String nomorHp;
    private String alamat;

    @OneToMany(mappedBy = "idHewan")
    private Set<PasienHewan> hewan;

    public PemilikHewan() {
    }
}
