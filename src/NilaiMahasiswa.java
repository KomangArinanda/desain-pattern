
public class NilaiMahasiswa {
    MataKuliah Matkul;
    String kodeMahasiswa;
    Character nilai;

    public MataKuliah getKodeMatkul() {
        return Matkul;
    }

    public NilaiMahasiswa(MataKuliah Matkul, String kodeMahasiswa, Character nilai) {
        this.Matkul = Matkul;
        this.kodeMahasiswa = kodeMahasiswa;
        this.nilai = nilai;
    }
    public NilaiMahasiswa(){

    }

    public void setKodeMatkul(MataKuliah Matkul) {

        this.Matkul = Matkul;
    }

    public String getKodeMahasiswa() {
        return kodeMahasiswa;
    }

    public void setKodeMahasiswa(String kodeMahasiswa) {
        this.kodeMahasiswa = kodeMahasiswa;
    }

    public Character getNilai() {
        return nilai;
    }

    public void setNilai(Character nilai) {
        this.nilai = nilai;
    }
}
