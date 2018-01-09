package com.company.DAO;

import com.company.MahasiswaBuilder;
import com.company.Model.Mahasiswa;
import com.company.Model.MataKuliah;

import java.util.ArrayList;
import java.util.List;

public class MatkulDAO {
    private static List<MataKuliah> daftarMataKuliah = new ArrayList<>();

    static {
        System.out.println("SISTEM SUDAH JALAN");
     daftarMataKuliah.add(new MataKuliah("DesignPattern", "KM123","Alham" ));
     daftarMataKuliah.add(new MataKuliah("PIK", "KM124","Komang" ));
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void addMatakuliah(MataKuliah mataKuliah){
        daftarMataKuliah.add(mataKuliah);
    }
}
