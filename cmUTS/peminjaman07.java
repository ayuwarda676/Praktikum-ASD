package cmUTS;

public class peminjaman07 {
    mahasiswa07 mhs;
    buku07 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    peminjaman07(mahasiswa07 mhs, buku07 buku, int lamaPinjam, int denda) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = denda;
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

    void statusKeterlambatan() {
        if (lamaPinjam > 5) {
            System.out.println("Status: Terlambat");
        } else {
            System.out.println("Status: Tepat Waktu");
        }
    }

    void tampilkanInfoPeminjaman() {
        System.out.println("Informasi Peminjaman: ");
        mhs.tampilkanInfo();
        buku.tampilkanInfo();
        statusKeterlambatan();
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Terlambat: " + terlambat + " hari");
        System.out.println("Denda: Rp " + denda);
    }

}
