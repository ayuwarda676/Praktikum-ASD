package Jobsheet5;
import java.util.Scanner;
public class mahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswaBerprestasi07 list = new mahasiswaBerprestasi07();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ipkStr = sc.nextLine();
            ipkStr = ipkStr.replace(",", ".");
            double ipk = Double.parseDouble(ipkStr);
            
            mahasiswa07 m = new mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
    
}
