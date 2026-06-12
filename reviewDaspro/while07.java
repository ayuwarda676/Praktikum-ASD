package reviewDaspro;

import java.util.Scanner;

public class while07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jumlah, i = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();
            i++;

            if (nilai < 0 || nilai > 100) {
                System.out.print("Nilai tidak valid, masukkan nilai antara 0-100!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
                System.out.println("Bagus, Pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E");
            }
            
        }
    }
    
}
