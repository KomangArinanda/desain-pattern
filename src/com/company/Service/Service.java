package com.company.Service;

import com.company.DAO.DaftarNilaiDAO;
import com.company.DAO.MahasiswaDAO;
import com.company.DAO.MatkulDAO;
import com.company.Model.MataKuliah;
import com.company.Model.NilaiMahasiswa;

public class Service{
    MatkulDAO matkulDAO = new MatkulDAO();
    DaftarNilaiDAO daftarNilaiDAO = new DaftarNilaiDAO();
    public void addMatakuliah(MataKuliah mataKuliah){
        matkulDAO.addMatakuliah(mataKuliah);
    }
    public void inputNilai(NilaiMahasiswa nilaiMahasiswa){
        daftarNilaiDAO.inputNilai(nilaiMahasiswa);
    }
}
