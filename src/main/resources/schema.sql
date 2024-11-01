create table if not exists dokter_hewan (
    id_dokter serial primary key,
    nama varchar(128) not null,
    nomor_hp varchar(128) not null,
    alamat text not null,
    jadwal_praktik time[]
);

create table if not exists pemilik_hewan (
    id_pemilik serial primary key,
    nama varchar(128) not null,
    nomor_hp varchar(128) not null,
    alamat text not null
);

create table if not exists pasien_hewan (
    id_hewan serial primary key,
    nama_hewan varchar(128) not null,
    usia integer not null,
    berat_badan integer not null,
    keterangan text,
    id_pemilik integer references pemilik_hewan(id_pemilik) not null
);

create table if not exists riwayat_periksa (
    id_riwayat serial primary key,
    hewan integer references pasien_hewan(id_hewan) not null,
    dokter integer references dokter_hewan(id_dokter) not null,
    diagnosa varchar(256) not null,
    keterangan text
);