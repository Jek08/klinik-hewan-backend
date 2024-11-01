package dev.jakapaw.klinikhewan.rest.dto;

import dev.jakapaw.klinikhewan.data.model.PasienHewan;
import dev.jakapaw.klinikhewan.data.model.PemilikHewan;
import lombok.Data;

import java.util.List;

@Data
public class DaftarBaru {

    PemilikHewan pemilik;
    List<PasienHewan> hewan;
}
