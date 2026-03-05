package Jobsheet3;

public class dosen07 {
    public String kode;
    public String nama;
    Boolean jenisKelamin;
    int usia;

    public dosen07(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampilData() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Laki-laki");
        } else {
            System.out.println("Jenis Kelamin : Perempuan");
        }
        System.out.println("Usia : " + usia);
        System.out.println();
    }
    
}
