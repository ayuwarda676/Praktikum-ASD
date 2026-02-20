package Jobsheet2;

public class mataKuliahMain07 {
    public static void main(String[] args) {
        mataKuliah07 mk1 = new mataKuliah07();
        mk1.kodeMK = "SI211";
        mk1.namaMK = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.jumlahjam = 45;
        mk1.tampilkanMatkul();

        mataKuliah07 mk2 = new mataKuliah07();
        mk2.kodeMK = "SI213";
        mk2.namaMK = "Praktikum Basis Data";
        mk2.sks = 3;
        mk2.jumlahjam = 45;
        mk2.tampilkanMatkul();

        mk1.ubahSks(4);
        mk1.tambahjam(2);
        mk1.tampilkanMatkul();

        mk2.kurangiJam(55);
        mk2.tampilkanMatkul();
    }
}
