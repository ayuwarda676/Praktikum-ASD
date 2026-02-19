package Jobsheet1;
import java.util.Scanner;
public class tugas2 {
    public static void inputJadwal(String[][] jadwal, Scanner input) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari: ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam: ");
            jadwal[i][3] = input.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] jadwal) {
        System.out.println("\n=== SEMUA JADWAL KULIAH ===");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.println("Mata Kuliah : " + jadwal[i][0]);
            System.out.println("Ruang       : " + jadwal[i][1]);
            System.out.println("Hari        : " + jadwal[i][2]);
            System.out.println("Jam         : " + jadwal[i][3]);
        }
    }

    public static void tampilkanBerdasarkanHari(String[][] jadwal, String hariCari) {
        System.out.println("\n=== JADWAL HARI " + hariCari.toUpperCase() + " ===");

        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                ketemu = true;
                System.out.println("\nMata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Jam         : " + jadwal[i][3]);
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void tampilkanBerdasarkanMK(String[][] jadwal, String mkCari) {
        System.out.println("\n=== JADWAL MATA KULIAH: " + mkCari + " ===");

        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                ketemu = true;
                System.out.println("\nRuang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
            }
        }

        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Jadwal Kuliah ===");

        System.out.print("Masukkan jumlah jadwal: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, input);
        tampilkanSemua(jadwal);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hariCari = input.nextLine();
        tampilkanBerdasarkanHari(jadwal, hariCari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mkCari = input.nextLine();
        tampilkanBerdasarkanMK(jadwal, mkCari);

        input.close();
    
    
    }
}
