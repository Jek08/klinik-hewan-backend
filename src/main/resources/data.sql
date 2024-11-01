insert into dokter_hewan (nama, nomor_hp, alamat, jadwal_praktik) values
('Rizky', '111222333', 'Jl. ABC', array[]::time[]),
('Eka', '121222333', 'Jl. ABC', array[]::time[]),
('Rita', '131222333', 'Jl. ABC', array[]::time[]),
('Tirta', '141222333', 'Jl. ABC', array[]::time[]),
('Ruslan', '151222333', 'Jl. ABC', array[]::time[]);

insert into pemilik_hewan (nama, nomor_hp, alamat) values
('Salma', '555666771', 'Jl. XYZ'),
('Sidik', '555666772', 'Jl. XYZ'),
('Indra', '555666773', 'Jl. XYZ'),
('Intan', '555666774', 'Jl. XYZ'),
('Agustina', '555666775', 'Jl. XYZ');

insert into pasien_hewan (nama_hewan, usia, berat_badan, keterangan, id_pemilik) values
('Zorro', 1, 3, '', 1),
('Chico', 2, 4, 'muntah-muntah, tidak makan', 2),
('Teddy', 1, 5, 'sulit makan, muntah-muntah', 2),
('Marley', 4, 5, '', 3),
('Bobby', 3, 6, 'obesitas', 4),
('Sol', 3, 4, '', 5);