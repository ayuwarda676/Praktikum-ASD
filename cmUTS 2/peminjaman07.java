package cmUTS;

public class peminjaman07 {
    mahasiswa07 mhs;
    buku07 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    peminjaman07(mahasiswa07 mhs, buku07 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilkanInfoPeminjaman() {
        System.out.println("Informasi Peminjaman: ");
        mhs.tampilkanInfo();
        buku.tampilkanInfo();
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Terlambat: " + terlambat + " hari");
        System.out.println("Denda: Rp " + denda);
    }

}
