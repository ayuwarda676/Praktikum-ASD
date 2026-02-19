package Jobsheet1;
import java.util.Scanner;
public class ipSemester07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program Menghitung IP Semester ===");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobot = new double[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println();
            System.out.println("Data MK ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();

            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0.0;
            }
        }

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            totalNilai += bobot[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalNilai / totalSKS;

        System.out.println();
        System.out.println("=== HASIL KONVERSI NILAI ===");
        System.out.printf("%-30s %-12s %-12s %-12s %-10s\n",
                "Mata Kuliah", "SKS", "Nilai", "Huruf", "Bobot");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-12d %-12.2f %-12s %-10.2f\n",
                    namaMK[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("Total SKS = %d\n", totalSKS);
        System.out.printf("IP Semester = %.2f\n", ip);

        sc.close();
    }
    
}
