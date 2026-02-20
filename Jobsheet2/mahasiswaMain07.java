package Jobsheet2;

public class mahasiswaMain07 {
    public static void main(String[] args) {
        mahasiswa07 mhs1 = new mahasiswa07();
        mhs1.nama = "Muhammad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI-2J";
        mhs1.ipk = 3.55;
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI-2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa07 mhs2 = new mahasiswa07("Annisa nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa07 mhs = new mahasiswa07("Ayu Wardattul Jannah", "254107020197", 3.40, "TI-1C");
        mhs.tampilkanInformasi();
    }
    
}
