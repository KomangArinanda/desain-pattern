package com.company.DAO;

import com.company.MahasiswaBuilder;
import com.company.Model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static MahasiswaBuilder builder = new MahasiswaBuilder();

    static {
        daftarMahasiswa.add(builder.setNamaMahasiswa("John").setNIMMahasiswa("123").setTanggalLahir("17").setGender("Laki-Laki").build());
        daftarMahasiswa.add(builder.setNamaMahasiswa("Karina").setNIMMahasiswa("456").setTanggalLahir("18").setGender("Perempuan").build());

    }

    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    ;

}
