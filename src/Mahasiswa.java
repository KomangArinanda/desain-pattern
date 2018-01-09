public class Mahasiswa {
    private String nama;
    private String NIM;
    private String tanggalLahir;
    private String gender;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", NIM='" + NIM + '\'' +
                ", tanggalLahir='" + tanggalLahir + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
