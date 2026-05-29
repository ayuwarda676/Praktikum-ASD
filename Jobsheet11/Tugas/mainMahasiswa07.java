package Jobsheet11.Tugas;
import java.util.Scanner;
public class mainMahasiswa07 {
    public static void menu() {

        System.out.println("\n=== MENU ANTRIAN KEMAHASISWAAN ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Lihat Antrian Terdepan");
        System.out.println("4. Lihat Antrian Terakhir");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList07 antrian = new linkedList07();
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    mahasiswa07 mhs =
                            new mahasiswa07(nim, nama, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatTerakhir();
                    break;
                case 5:
                    antrian.tampilSemua();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 0);
    }
}
