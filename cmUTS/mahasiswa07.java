package cmUTS;

public class mahasiswa07 {
    String nim;
    String nama;
    String prodi;

    mahasiswa07(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
}
