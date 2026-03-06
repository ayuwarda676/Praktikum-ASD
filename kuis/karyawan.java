package kuis;

public class karyawan {
    String idPegawai;
    String nama;
    Double gajiPokok;
    int hariKerja;

    public karyawan() {
        
    }
    
    public karyawan(String idPegawai, String nama, Double gajiPokok, int hariKerja) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.hariKerja = hariKerja;
    }

    void tampilkanInformasi() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Hari Kerja: " + hariKerja);
    }

    double hitungGajiBulanan() {
        return gajiPokok * hariKerja / 25;
    }
    
}
