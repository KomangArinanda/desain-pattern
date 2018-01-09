
public class DaftarNilai {
    MataKuliah Matkul;
    String kodeMahasiswa;
    Character nilai;

    public MataKuliah getKodeMatkul() {
        return Matkul;
    }

    public DaftarNilai(MataKuliah Matkul, String kodeMahasiswa, Character nilai) {
        this.Matkul = Matkul;
        this.kodeMahasiswa = kodeMahasiswa;
        this.nilai = nilai;
    }
    public DaftarNilai(){

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
