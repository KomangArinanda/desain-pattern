
public class DaftarNilai {
    MataKuliah matkul;
    String kodeMahasiswa;
    String nilai;


    public DaftarNilai(MataKuliah matkul, String kodeMahasiswa, String nilai) {
        this.matkul = matkul;
        this.kodeMahasiswa = kodeMahasiswa;
        this.nilai = nilai;
    }
    public DaftarNilai(){

    }


    public String getKodeMahasiswa() {
        return kodeMahasiswa;
    }

    public void setKodeMahasiswa(String kodeMahasiswa) {
        this.kodeMahasiswa = kodeMahasiswa;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public MataKuliah getMatkul() {
        return this.matkul;
    }
}
