package Jobsheet2;

public class classDosen07 {
    String idDosen;
    String namaDosen;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public classDosen07() {
        
    }

    public classDosen07(String idDosen, String namaDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanDosen() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status) {
            statusAktif = true;
            System.out.println("Status dosen aktif.");
        } else {
            statusAktif = false;
            System.out.println("Status dosen tidak aktif.");
        }
    }

    void hitungMasaKerja(int tahunSekarang) {
        if (tahunSekarang >= tahunBergabung) {
            int masaKerja = tahunSekarang - tahunBergabung;
            System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
        } else {
            System.out.println("masa kerja tidak valid.");
        }
    }

    void ubahBidangKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
        System.out.println("Bidang keahlian dosen telah diubah menjadi: " + bidangKeahlian);
    }

}
