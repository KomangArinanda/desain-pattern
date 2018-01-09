package com.company;

import com.company.Model.NilaiMahasiswa;

import java.util.ArrayList;
import java.util.List;

public class DaftarNilaiMahasiswa {
    public static List<NilaiMahasiswa> instance = null;

    public static List<NilaiMahasiswa> getInstance() {
        if(instance == null){
            instance = new ArrayList<>();
        }
        return instance;
    }

    private DaftarNilaiMahasiswa() {
    }
}
