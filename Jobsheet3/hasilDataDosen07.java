package Jobsheet3;
import java.util.Scanner;
public class hasilDataDosen07 {
    Scanner sc = new Scanner(System.in);
    dataDosen07[] arrayOfDosen = new dataDosen07[3];
    String nama, dummy;
    Boolean jenisKelamin;
    int usia;

    void inputDataDosen() {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan) : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            
            arrayOfDosen[i] = new dataDosen07();
            arrayOfDosen[i].nama = nama;
            arrayOfDosen[i].jenisKelamin = jenisKelamin;
            arrayOfDosen[i].usia = usia;
        }
    }

    public static void main(String[] args) {
        hasilDataDosen07 data = new hasilDataDosen07();
        data.inputDataDosen();

        System.out.println("Data semua dosen: ");
        dataDosenDemo07.dataSemuaDosen(data.arrayOfDosen);
        System.out.println();

        System.out.println("Jumlah dosen per jenis kelamin: ");
        dataDosenDemo07.jumlahDosenPerJenisKelamin(data.arrayOfDosen);
        System.out.println();

        System.out.println("Rata-rata usia dosen: ");
        dataDosenDemo07.rataRataUsiaDosenPerJenisKelamin(data.arrayOfDosen);
        System.out.println();

        dataDosenDemo07.dosenTertuaDanTermuda(data.arrayOfDosen);
    }
    
}
