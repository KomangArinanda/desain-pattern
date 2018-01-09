package com.company.DAO;

import com.company.DaftarNilaiMahasiswa;
import com.company.Model.Mahasiswa;
import com.company.Model.MataKuliah;
import com.company.Model.NilaiMahasiswa;

import java.util.ArrayList;
import java.util.List;

public class DaftarNilaiDAO {
    private static MatkulDAO matkulDAO = new MatkulDAO();
    private static List<NilaiMahasiswa> daftarNilaiMahasiswa = DaftarNilaiMahasiswa.getInstance();
    private static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static MahasiswaDAO mahasiswaDAO =  new MahasiswaDAO();

    static {
        daftarMataKuliah = matkulDAO.getDaftarMataKuliah();
        daftarMahasiswa = mahasiswaDAO.getDaftarMahasiswa();

        daftarNilaiMahasiswa.add(new NilaiMahasiswa(daftarMataKuliah.get(0), daftarMahasiswa.get(0).getNIM(), 'A'));
        daftarNilaiMahasiswa.add(new NilaiMahasiswa(daftarMataKuliah.get(1), daftarMahasiswa.get(0).getNIM(), 'B'));
        daftarNilaiMahasiswa.add(new NilaiMahasiswa(daftarMataKuliah.get(0), daftarMahasiswa.get(1).getNIM(), 'C'));
        daftarNilaiMahasiswa.add(new NilaiMahasiswa(daftarMataKuliah.get(1), daftarMahasiswa.get(1).getNIM(), 'B'));

    }

    public List<MataKuliah> getDaftarMahasiswa() {
        return daftarMataKuliah;
    }

    public void addMatakuliah(MataKuliah mataKuliah){
        daftarMataKuliah.add(mataKuliah);
    }
    public void inputNilai(NilaiMahasiswa nilaiMahasiswa){
        daftarNilaiMahasiswa.add(nilaiMahasiswa);
    }
}
