package Jobsheet11.Tugas;

public class mahasiswa07 {
    String nim;
    String nama;
    String kelas;

    mahasiswa07(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
    }
    
}
