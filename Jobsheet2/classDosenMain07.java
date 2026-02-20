package Jobsheet2;

public class classDosenMain07 {
    public static void main(String[] args) {
        classDosen07 dosen1 = new classDosen07("D001", "Ahmad", true, 2010, "Pemrograman");
        dosen1.tampilkanDosen();

        classDosen07 dosen2 = new classDosen07("D002", "Siti", true, 2015, "Basis Data");
        dosen2.tampilkanDosen();

        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilkanDosen();

        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahBidangKeahlian("Jaringan Komputer");
        dosen2.tampilkanDosen();
    }
    
}
