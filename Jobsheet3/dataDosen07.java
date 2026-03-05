package Jobsheet3;

public class dataDosen07 {
    String nama;
    Boolean jenisKelamin;
    int usia;

    void tampilData() {
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