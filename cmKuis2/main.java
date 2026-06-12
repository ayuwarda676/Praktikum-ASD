package cmKuis2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        singleLinkedList sll = new singleLinkedList();
        Scanner input = new Scanner(System.in);
        int menu = 0;

        // Inisialisasi data awal pembeli otomatis agar memudahkan demonstrasi
        sll.tambahAntrean("Vania", "08422234556");
        sll.tambahAntrean("Rara", "08224522222");
        sll.tambahAntrean("Dara", "08224511111");
        sll.tambahAntrean("Alma", "08224500000");

        do {
            System.out.println("\n=======================================");
            System.out.println("SISTEM ANTREAN ROYAL DELISH");
            System.out.println("=======================================");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Hapus Antrean dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            if (input.hasNextInt()) {
                menu = input.nextInt();
                input.nextLine(); 
            } else {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = input.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = input.nextLine();
                    sll.tambahAntrean(nama, noHp);
                    break;

                case 2:
                    sll.cetakAntrean();
                    break;

                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = input.nextLine();
                    System.out.print("Harga        : ");
                    int harga = input.nextInt();
                    input.nextLine();
                    sll.hapusAntreanDanPesan(kode, namaPesanan, harga);
                    break;

                case 4:
                    sll.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem Royal Delish!");
                    break;

                default:
                    System.out.println("Menu tidak valid! Silakan pilih menu 0-4.");
            }
        } while (menu != 0);

        input.close();
    }
}
