import java.util.ArrayList;
import java.util.List;



public class Methods {

    List<NilaiMahasiswa> daftarNilai = new ArrayList<>();
    public void inputNilai(MataKuliah mataKuliah, String kodeMahasiswa, Character nilai){
        NilaiMahasiswa nilaiMahasiswa = new NilaiMahasiswa();
        nilaiMahasiswa.setKodeMahasiswa( kodeMahasiswa);
        nilaiMahasiswa.setKodeMatkul(mataKuliah);
        daftarNilai.add(nilaiMahasiswa);
    }
}
