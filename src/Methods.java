import java.util.ArrayList;
import java.util.List;



public class Methods {

    List<DaftarNilai> daftarNilai = new ArrayList<>();
    public void inputNilai(MataKuliah mataKuliah, String kodeMahasiswa, Character nilai){
        DaftarNilai daftarNilai = new DaftarNilai();
        daftarNilai.setKodeMahasiswa( kodeMahasiswa);
        daftarNilai.setKodeMatkul(mataKuliah);
        daftarNilai.setNilai(nilai);
        daftarNilai.add(daftarNilai);
    }
}
