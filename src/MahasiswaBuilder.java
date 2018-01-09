public class MahasiswaBuilder {

    private Mahasiswa mahasiswa;

    public MahasiswaBuilder() {
         this.mahasiswa = new Mahasiswa();
    }
    public MahasiswaBuilder setNamaMahasiswa (String nama) {
        this.mahasiswa.setNama(nama);
        return this;
    }
    public MahasiswaBuilder setNIMMahasiswa (String NIM) {
        this.mahasiswa.setNIM(NIM);
        return this;
    }
    public MahasiswaBuilder setTanggalLahir (String TanggalLahir) {
        this.mahasiswa.setTanggalLahir(TanggalLahir);
        return this;
    }
    public MahasiswaBuilder setGender(String Gender) {
        this.mahasiswa.setGender(Gender);
        return this;
    }
    public Mahasiswa build() {
        return this.mahasiswa;
    }
}
