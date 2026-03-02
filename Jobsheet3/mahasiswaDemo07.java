package Jobsheet3;
import java.util.Scanner;
public class mahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa07[] arrayOfmahasiswa = new mahasiswa07[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfmahasiswa[i] = new mahasiswa07();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfmahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayOfmahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfmahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfmahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
            
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            arrayOfmahasiswa[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
    
}
