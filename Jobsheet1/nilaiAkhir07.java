package Jobsheet1;
import java.util.Scanner;
public class nilaiAkhir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir ");
        System.out.println("==============================");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("=================================");
        double nilaiAkhir = (tugas * 0.3) + (kuis * 0.1) + (uts * 0.3) + (uas * 0.3);

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
        
        String nilaiHuruf = "";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        } else {
            System.out.println("Nilai Tidak Valid");
        }

        double nilaiSetara = 0;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiSetara = 4;
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiSetara = 3.5;
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiSetara = 3;
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiSetara = 2.5;
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiSetara = 2;
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiSetara = 1;
        } else if (nilaiAkhir <= 39) {
            nilaiSetara = 0;
        } else {
            System.out.println("Nilai Setara Tidak Valid");
        }
        
        String kualifikasi = "";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            kualifikasi = "Gagal";
        } else {
            System.out.println("Kualifikasi Tidak Valid");
        }

        String statusKelulusan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            statusKelulusan = "LULUS";
        } else {
            statusKelulusan = "TIDAK LULUS";
        }

        System.out.println("=================================");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("Status Kelulusan: " + statusKelulusan);
        
        }
    }
}
