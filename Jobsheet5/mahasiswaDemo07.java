package Jobsheet5;

public class mahasiswaDemo07 {
    public static void main(String[] args) {
        mahasiswaBerprestasi07 list = new mahasiswaBerprestasi07();
        mahasiswa07 m1 = new mahasiswa07("123", "Zidan", "2A", 3.2);
        mahasiswa07 m2 = new mahasiswa07("124", "Ayu", "2A", 3.5);
        mahasiswa07 m3 = new mahasiswa07("125", "Sofi", "2A", 3.1);
        mahasiswa07 m4 = new mahasiswa07("126", "Sita", "2A", 3.9);
        mahasiswa07 m5 = new mahasiswa07("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
    
}
