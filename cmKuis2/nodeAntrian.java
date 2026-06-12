package cmKuis2;

class nodeAntrian {
    int nomorAntrian;
    classPembeli pembeli;
    nodeAntrian next;// Hanya menunjuk ke node depan/selanjutny

    public nodeAntrian(int nomorAntrian, classPembeli pembeli) {
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.next = null;
    }
    
}

class nodePesanan {
    pesanan pesanan;
    nodePesanan next; // Hanya menunjuk ke node depan/selanjutny 

    public nodePesanan(pesanan pesanan) {
        this.pesanan = pesanan;
        this.next = null;
    }
    
}
