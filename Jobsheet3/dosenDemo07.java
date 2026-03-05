package Jobsheet3;
import java.util.Scanner;
public class dosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dosen07[] arrayOfdosen = new dosen07[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfdosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan) : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            
            arrayOfdosen[i] = new dosen07(kode, nama, jenisKelamin, usia);
        }

        int count = 1;
        for (dosen07 dosen : arrayOfdosen) {
            System.out.println("Data dosen ke-" + count);
            System.out.println("Kode : " + dosen.kode);
            System.out.println("Nama : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia : " + dosen.usia);
            System.out.println("-----------------------------------");
            count++;
        }
        
    }
    
}
