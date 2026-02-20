package Jobsheet2;

public class mataKuliah07 {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahjam;

    public mataKuliah07() {
        
    }

    public mataKuliah07(String kodeMK, String namaMK, int sks, int jumlahjam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilkanMatkul(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }
    
}
