package Jobsheet3;
import java.util.Scanner;
public class mataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        mataKuliah07[] arrayOfmataKuliah = new mataKuliah07[3];
        String kode, nama,dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah mata kuliah yang akan diinput: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());

        mataKuliah07[] arrayOfMataKuliah = new mataKuliah07[jumlahMataKuliah];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            
            arrayOfmataKuliah[i] = new mataKuliah07();
            arrayOfmataKuliah[i] = new mataKuliah07(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------------");
        }

        System.out.println("Cetak info semua mata kuliah:");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
    
}
