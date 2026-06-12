package cmUTS;

public class antrian {
    
    // 1. STRUKTUR QUEUE (Untuk Antrean Pembeli - Prinsip FIFO)
    NodeAntrean headAntrean = null; // Ini bertindak sebagai FRONT (Depan Antrean)
    NodeAntrean tailAntrean = null; // Ini bertindak sebagai REAR (Belakang Antrean)
    int counterAntrean = 1;

    // Operasi Enqueue: Menambah antrean di belakang (Rear)
    public void enqueueAntrean(String nama, String noHp) {
        Pembeli pembeliBaru = new Pembeli(nama, noHp);
        NodeAntrean nodeBaru = new NodeAntrean(counterAntrean, pembeliBaru);

        if (headAntrean == null) {
            headAntrean = nodeBaru;
            tailAntrean = nodeBaru;
        } else {
            tailAntrean.next = nodeBaru;
            tailAntrean = nodeBaru;
        }
        System.out.println("Antrean berhasil ditambahkan dengan nomor: " + counterAntrean);
        counterAntrean++;
    }

    // Operasi Dequeue: Mengambil & menghapus antrean dari depan (Front)
    // Fungsi ini mengembalikan data node terdepan yang keluar dari antrean
    private NodeAntrean dequeueAntrean() {
        if (headAntrean == null) {
            return null;
        }
        NodeAntrean diproses = headAntrean; // Ambil yang paling depan
        if (headAntrean == tailAntrean) {
            headAntrean = null;
            tailAntrean = null;
        } else {
            headAntrean = headAntrean.next; // Geser head ke belakangnya
        }
        return diproses;
    }
    // Tampilkan isi Queue Antrean
    public void cetakAntrean() {
        if (headAntrean == null) {
            System.out.println("---------------------------------------");
            System.out.println("Daftar Antrean Pembeli Kosong!");
            System.out.println("---------------------------------------");
            return;
        }

        System.out.println("---------------------------------------");
        System.out.println("Daftar Antrean Pembeli (QUEUE)");
        System.out.println("---------------------------------------");
        System.out.printf("%-12s | %-12s | %-12s\n", "No Antrean", "Nama", "No HP");
        System.out.println("---------------------------------------");
        
        NodeAntrean current = headAntrean;
        while (current != null) {
            System.out.printf("%-12d | %-12s | %-12s\n", 
                    current.noAntrean, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
        System.out.println("---------------------------------------");
    }


    // ---------------------------------------------------------------
    // 2. STRUKTUR STACK (Untuk Laporan Pesanan - Prinsip LIFO)
    // ---------------------------------------------------------------
    NodePesanan topPesanan = null; // Head diganti nama menjadi TOP (Puncak Tumpukan)

    // Operasi Push: Memasukkan nota pesanan baru ke atas tumpukan (Insert First)
    public void pushPesanan(Pesanan pesananBaru) {
        NodePesanan nodePesananBaru = new NodePesanan(pesananBaru);
        
        // Letakkan di paling atas tumpukan (Top)
        nodePesananBaru.next = topPesanan;
        topPesanan = nodePesananBaru;
    }


    // ---------------------------------------------------------------
    // 3. LOGIKA UTAMA GABUNGAN (Hapus Antrean & Catat Pesanan)
    // ---------------------------------------------------------------
    public void hapusAntreanDanPesan(int kode, String namaMakanan, int harga) {
        // 1. Jalankan fungsi DEQUEUE untuk mengeluarkan pembeli terdepan
        NodeAntrean pembeliKeluar = dequeueAntrean();

        if (pembeliKeluar == null) {
            System.out.println("Tidak ada antrean yang bisa diproses!");
            return;
        }

        System.out.println(pembeliKeluar.pembeli.namaPembeli + " telah menuju kasir dan memesan " + namaMakanan);

        // 2. Jalankan fungsi PUSH untuk menumpuk laporan pesanan baru
        Pesanan pesananBaru = new Pesanan(kode, namaMakanan, harga);
        pushPesanan(pesananBaru);
    }

    // Tampilkan isi Stack Laporan Pesanan (Tanpa / Dengan Sorting)
    public void laporanPesanan() {
        if (topPesanan == null) {
            System.out.println("---------------------------------------");
            System.out.println("Belum ada laporan pesanan (Stack Kosong)!");
            System.out.println("---------------------------------------");
            return;
        }

        // Opsional: Urutkan dulu menggunakan Bubble Sort bawaan kemarin
        sortPesananSesuaiNama();

        System.out.println("---------------------------------------");
        System.out.println("LAPORAN TUMPUKAN PESANAN (STACK LIFO)");
        System.out.println("---------------------------------------");
        System.out.printf("%-12s | %-15s | %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        System.out.println("---------------------------------------");

        NodePesanan current = topPesanan; // Mulai membaca dari TOP tumpukan
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

    // Fungsi sorting Bubble Sort pada Stack
    private void sortPesananSesuaiNama() {
        if (topPesanan == null || topPesanan.next == null) return;
        boolean swapped;
        NodePesanan current;
        do {
            swapped = false;
            current = topPesanan;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    dll.enqueueAntrean("Vania", "08422234556");

    // hitung sisa antrian
public void hitungSisaAntrean() {
    int jumlah = 0;
    NodeAntrean current = headAntrean;
    
    // Berjalan dari depan ke belakang sambil menghitung gerbong
    while (current != null) {
        jumlah++;
        current = current.next;
    }
    System.out.println("---------------------------------------");
    System.out.println("Jumlah pelanggan dalam antrean saat ini: " + jumlah + " orang.");
    System.out.println("---------------------------------------");
    System.out.println("main menu 5. Hitung Sisa Antrean");

    // menu termahal
public void menuTermahal() {
    if (topPesanan == null) {
        System.out.println("Belum ada data pesanan yang masuk.");
        return;
    }

    NodePesanan current = topPesanan;
    // Asumsikan gerbong pertama sebagai yang termahal dulu
    Pesanan termahal = current.pesanan;

    // Mulai menyusuri tumpukan nota pesanan
    while (current != null) {
        if (current.pesanan.harga > termahal.harga) {
            termahal = current.pesanan; // Update jika ketemu yang lebih mahal
        }
        current = current.next;
    }

    System.out.println("---------------------------------------");
    System.out.println("MENU DENGAN NILAI JUAL TERTINGGI");
    System.out.println("---------------------------------------");
    System.out.println("Nama Menu : " + termahal.namaPesanan);
    System.out.println("Harga     : " + termahal.harga);
    System.out.println("Kode      : " + termahal.kodePesanan);
    System.out.println("---------------------------------------");
}
    // Tambahkan peek untuk melihat antrean terdepan tanpa menghapusnya
public void peekAntrean() {
    if (headAntrean == null) {
        System.out.println("---------------------------------------");
        System.out.println("Antrean kosong! Tidak ada yang bisa diintip.");
        System.out.println("---------------------------------------");
        return;
    }
    

    System.out.println("---------------------------------------");
    System.out.println("PELANGGAN TERDEPAN SAAT INI (PEEK QUEUE)");
    System.out.println("---------------------------------------");
    System.out.println("No Antrean : " + headAntrean.noAntrean);
    System.out.println("Nama       : " + headAntrean.pembeli.namaPembeli);
    System.out.println("No HP      : " + headAntrean.pembeli.noHp);
    System.out.println("---------------------------------------");
}
    // Tambahkan peek melihat nota pesanan terbaru tanpa menghapusnya
public void peekPesananTerbaru() {
    if (topPesanan == null) {
        System.out.println("---------------------------------------");
        System.out.println("Belum ada riwayat transaksi (Stack Kosong).");
        System.out.println("---------------------------------------");
        return;
    }

    // Langsung mengambil data dari pointer TOP
    System.out.println("---------------------------------------");
    System.out.println("TRANSAKSI TERAKHIR SELESAI (PEEK STACK)");
    System.out.println("---------------------------------------");
    System.out.println("Kode Pesanan : " + topPesanan.pesanan.kodePesanan);
    System.out.println("Nama Pesanan : " + topPesanan.pesanan.namaPesanan);
    System.out.println("Total Harga  : " + topPesanan.pesanan.harga);
    System.out.println("---------------------------------------");
}
    // ===================================================================
// OPERASI PENGECEKAN KEKOSONGAN (isEmpty)
// ===================================================================

// Fungsi mengecek apakah Queue Antrean kosong
public boolean isAntreanEmpty() {
    // Jika headAntrean bernilai null, berarti tidak ada orang mengantre (true)
    return headAntrean == null; 
}

// Fungsi mengecek apakah Stack Laporan Pesanan kosong
public boolean isPesananEmpty() {
    // Jika topPesanan bernilai null, berarti belum ada nota transaksi (true)
    return topPesanan == null; 
}

// Contoh merapikan fungsi cetak antrean menggunakan isAntreanEmpty()
public void cetakAntrean() {
    if (isAntreanEmpty()) { // <-- Lebih rapi dan mudah dibaca manusia
        System.out.println("---------------------------------------");
        System.out.println("Daftar Antrean Pembeli Kosong!");
        System.out.println("---------------------------------------");
        return;
    }
    // ... sisa kode di bawahnya tetap sama ...
}
System.out.println("6. Intip Nota Terakhir (Peek Stack)");
System.out.println("7. Cek Status Kekosongan (isEmpty)       <-- BARU");
System.out.println("0. Keluar");

case 7:
    System.out.println("---------------------------------------");
    System.out.println("STATUS KEKOSONGAN STRUKTUR DATA");
    System.out.println("---------------------------------------");

    // Cek kondisi Queue Antrean
    if (sll.isAntreanEmpty()) {
        System.out.println("Antrean Pembeli (Queue) : KOSONG");
    } else {
        System.out.println("Antrean Pembeli (Queue) : TERISI");
    }

    // Cek kondisi Stack Laporan
    if (sll.isPesananEmpty()) {
        System.out.println("Laporan Nota (Stack)    : KOSONG");
    } else {
        System.out.println("Laporan Nota (Stack)    : TERISI");
    }
    System.out.println("---------------------------------------");
    break;
}
}
