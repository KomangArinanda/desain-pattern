package com.company.Model;

public class MataKuliah {
    String nama;
    String kodeMatkul;
    String namaDosen;

    public MataKuliah(String nama, String kodeMatkul, String namaDosen) {
        this.nama = nama;
        this.kodeMatkul = kodeMatkul;
        this.namaDosen = namaDosen;
    }

    public MataKuliah() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeMahasiswa() {
        return kodeMatkul;
    }

    public void setKodeMahasiswa(String kodeMahasiswa) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
}