package kuis;

public class kuis07 {
    public static void main(String[] args) {
        karyawan karyawan1 = new karyawan("116", "Irfan", 2500000.0, 20);
        karyawan karyawan2 = new karyawan("121", "Timine", 2750000.0, 22);
        karyawan karyawan3 = new karyawan("124", "Luvi", 2500000.0, 25);
        karyawan karyawan4 = new karyawan("147", "Siti", 3000000.0, 24);
        
        System.out.println("Data Karyawan 1:");
        karyawan1.tampilkanInformasi();
        System.out.println("Gaji Total: " + karyawan1.hitungGajiBulanan());

        System.out.println("\nData Karyawan 2:");
        karyawan2.tampilkanInformasi();
        System.out.println("Gaji Total: " + karyawan2.hitungGajiBulanan());

        System.out.println("\nData Karyawan 3:");
        karyawan3.tampilkanInformasi();
        System.out.println("Gaji Total: " + karyawan3.hitungGajiBulanan());

        System.out.println("\nData Karyawan 4:");
        karyawan4.tampilkanInformasi();
        System.out.println("Gaji Total: " + karyawan4.hitungGajiBulanan());
    }
    
}
