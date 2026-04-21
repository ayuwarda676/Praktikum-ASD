package cmUTS;

public class tampilkan07 {
    public static void main(String[] args) {

        // DATA MAHASISWA
        mahasiswa07[] mhs = {
            new mahasiswa07("22001", "Andi", "Teknik Informatika"),
            new mahasiswa07("22002", "Budi", "Teknik Informatika"),
            new mahasiswa07("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // DATA BUKU
        buku07[] buku = {
            new buku07("B001", "Algoritma", 2020),
            new buku07("B002", "Basis Data", 2019),
            new buku07("B003", "Pemrograman", 2021),
            new buku07("B004", "Fisika", 2024)
        };

        // DATA PEMINJAMAN
        peminjaman07[] peminjaman = {
            new peminjaman07(mhs[0], buku[0], 7, 4000),
            new peminjaman07(mhs[1], buku[1], 3, 0),
            new peminjaman07(mhs[2], buku[2], 10, 10000),
            new peminjaman07(mhs[2], buku[3], 6, 2000),
            new peminjaman07(mhs[0], buku[1], 4, 0)
        };

        // MENU 1 MAHASISWA
        System.out.println("=== MENU 1: Tampilkan Data Mahasiswa ===");
        for (mahasiswa07 m : mhs) {
            m.tampilkanInfo();
            System.out.println();
        }

        // MENU 2 BUKU
        System.out.println("=== MENU 2: Tampilkan Data Buku ===");
        for (buku07 b : buku) {
            b.tampilkanInfo();
            System.out.println();
        }

        // MENU 3 PEMINJAMAN
        System.out.println("=== MENU 3: Tampilkan Data Peminjaman ===");
        for (peminjaman07 p : peminjaman) {
            p.tampilkanInfoPeminjaman();
            System.out.println();
        }

        // MENU 4 SORTING PEMINJAMAN BERDASARKAN DENDA TERBANYAK
        System.out.println("=== MENU 4: Sorting Peminjaman Berdasarkan Denda Terbanyak ===");
        for (int i = 0; i < peminjaman.length - 1; i++) {
            for (int j = 0; j < peminjaman.length - i - 1; j++) {
                if (peminjaman[j].denda < peminjaman[j + 1].denda) {
                    peminjaman07 temp = peminjaman[j];
                    peminjaman[j] = peminjaman[j + 1];
                    peminjaman[j + 1] = temp;
                }
            }
        }
        for (peminjaman07 p : peminjaman) {
            p.tampilkanInfoPeminjaman();
            System.out.println();
        }

        // MENU 5 SEARCHING PEMINJAMAN BERDASARKAN NIM MAHASISWA
        System.out.println("=== MENU 5: Searching Peminjaman Berdasarkan Prodi Mahasiswa ===");
        String cariProdi = "Teknik Informatika";
        boolean ditemukan = false;
        for (peminjaman07 p : peminjaman) {
            if (p.mhs.prodi.equalsIgnoreCase(cariProdi)) {
                p.tampilkanInfoPeminjaman();
                ditemukan = true;
                System.out.println();
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan");
        }
        
        // MENU 6 AKUMULASI DENDA SETIAP MAHASISWA
        System.out.println("=== MENU 6: Akumulasi Denda Setiap Mahasiswa ===");
        for (mahasiswa07 m : mhs) {
            int totalDenda = 0;
            for (peminjaman07 p : peminjaman) {
                if (p.mhs.nim.equals(m.nim)) {
                    totalDenda += p.denda;
                }
            }
            System.out.println("Mahasiswa: " + m.nama + " - Total Denda: Rp " + totalDenda);
            
        }

        int totalSemuaDenda = 0;
        int totalDenda = 0;
        for (peminjaman07 p : peminjaman) {
            totalDenda += p.denda;
        }
        totalSemuaDenda += totalDenda;
        System.out.println("Total Denda Semua Mahasiswa: Rp " + totalSemuaDenda);
        

    }
    
}
