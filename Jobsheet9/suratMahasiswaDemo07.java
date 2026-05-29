package Jobsheet9;
import java.util.Scanner;
public class suratMahasiswaDemo07 {
    public static void main(String[] args) {
        StackSuratMahasiswa07 stack = new StackSuratMahasiswa07(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {

            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("ID Surat : ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi : ");
                    int durasi = sc.nextInt();

                    suratMahasiswa07 srt = new suratMahasiswa07(id, nama, kelas, jenis, durasi);

                    stack.push(srt);

                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:

                    suratMahasiswa07 proses = stack.pop();

                    if (proses != null) {
                        System.out.println("Surat diproses dari:");
                        System.out.println(proses.namaMahasiswa);
                    }

                    break;

                case 3:

                    suratMahasiswa07 lihat = stack.peek();

                    if (lihat != null) {

                        System.out.println("Surat terakhir:");
                        System.out.println("ID Surat : " + lihat.idSurat);
                        System.out.println("Nama : " + lihat.namaMahasiswa);
                        System.out.println("Kelas : " + lihat.kelas);
                        System.out.println("Jenis : " + lihat.jenisIzin);
                        System.out.println("Durasi : " + lihat.durasi);
                    }

                    break;

                case 4:

                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();

                    boolean ketemu = stack.cariSurat(cari);

                    if (ketemu) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }

                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 5);
    }
    
}
