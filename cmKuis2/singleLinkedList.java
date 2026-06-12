package cmKuis2;

public class singleLinkedList {
    nodeAntrian headAntrean = null;
    nodeAntrian tailAntrean = null;

    nodePesanan headPesanan = null;
    int counterAntrean = 1;

    // Fitur 1: Tambah Antrean di belakang (Insert Last)
    public void tambahAntrean(String nama, String noHp) {
        classPembeli pembeliBaru = new classPembeli(nama, noHp);
        nodeAntrian nodeBaru = new nodeAntrian(counterAntrean, pembeliBaru);

        if (headAntrean == null) {
            // Jika list kosong, head dan tail menunjuk ke node baru yang sama
            headAntrean = nodeBaru;
            tailAntrean = nodeBaru;
        } else {
            // Sambungkan ujung ekor (tail) ke node baru, lalu geser posisi tail
            tailAntrean.next = nodeBaru;
            tailAntrean = nodeBaru;
        }
        System.out.println("Antrean berhasil ditambahkan dengan nomor: " + counterAntrean);
        counterAntrean++;
    }

    // Fitur 2: Cetak Semua Antrean
    public void cetakAntrean() {
        if (headAntrean == null) {
            System.out.println("---------------------------------------");
            System.out.println("Daftar Antrean Pembeli Kosong!");
            System.out.println("---------------------------------------");
            return;
        }

        System.out.println("---------------------------------------");
        System.out.println("Daftar Antrean Pembeli");
        System.out.println("---------------------------------------");
        System.out.printf("%-12s | %-12s | %-12s\n", "No Antrean", "Nama", "No HP");
        System.out.println("---------------------------------------");
        
        nodeAntrian current = headAntrean;
        while (current != null) {
            System.out.printf("%-12d | %-12s | %-12s\n", 
                    current.nomorAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next; // Bergeser maju ke node berikutnya
        }
        System.out.println("---------------------------------------");
    }

    // Fitur 3: Hapus Antrean Terdepan & Catat Pesanan (Delete First)
    public void hapusAntreanDanPesan(int kode, String namaMakanan, int harga) {
        if (headAntrean == null) {
            System.out.println("Tidak ada antrean yang bisa diproses!");
            return;
        }

        // 1. Dapatkan antrean paling depan untuk diproses ke kasir
        nodeAntrian diproses = headAntrean;
        System.out.println(diproses.pembeli.namaPembeli + " telah memesan " + namaMakanan);

        // 2. Simpan pesanan barunya ke dalam list Laporan Pesanan (Disisipkan di awal / Insert First)
        pesanan pesananBaru = new pesanan(kode, namaMakanan, harga);
        nodePesanan nodePesananBaru = new nodePesanan(pesananBaru);
        
        // Memasukkan data pesanan baru ke daftar laporan (Insert First)
        nodePesananBaru.next = headPesanan;
        headPesanan = nodePesananBaru;

        // 3. Singkirkan antrean yang sudah dilayani dari daftar (Geser Head maju 1 langkah)
        if (headAntrean == tailAntrean) { 
            headAntrean = null;
            tailAntrean = null;
        } else {
            headAntrean = headAntrean.next;
        }
    }

    // Fitur 4: Tampilkan Laporan Pesanan + Urutkan manual dengan Bubble Sort
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("---------------------------------------");
            System.out.println("Belum ada pesanan yang masuk!");
            System.out.println("---------------------------------------");
            return;
        }

        // Panggil fungsi pengurutan nama sebelum dicetak
        sortPesananSesuaiNama();

        System.out.println("---------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("---------------------------------------");
        System.out.printf("%-12s | %-15s | %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        System.out.println("---------------------------------------");

        nodePesanan current = headPesanan;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-12d | %-15s | %-10d\n", 
                    current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            totalPendapatan += current.pesanan.harga;
            current = current.next;
        }
        System.out.println("---------------------------------------");
        System.out.println("TOTAL PENDAPATAN : " + totalPendapatan);
        System.out.println("---------------------------------------");
    }

    // Fungsi pengurutan nama manual (Bubble Sort untuk Single Linked List)
    private void sortPesananSesuaiNama() {
        if (headPesanan == null || headPesanan.next == null) return;

        boolean swapped;
        nodePesanan current;

        do {
            swapped = false;
            current = headPesanan;

            while (current.next != null) {
                // Jika alfabet nama pesanan sekarang lebih besar daripada depannya, maka tukar isinya
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
