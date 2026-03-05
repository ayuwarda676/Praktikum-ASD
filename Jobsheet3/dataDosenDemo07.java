package Jobsheet3;

public class dataDosenDemo07 {
    static void dataSemuaDosen(dataDosen07[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilData();
        }
    }

    static void jumlahDosenPerJenisKelamin(dataDosen07[] arrayOfDosen) {
        int countLakiLaki = 0;
        int countPerempuan = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                countLakiLaki++;
            } else {
                countPerempuan++;
            }
        }

        System.out.println("Jumlah dosen laki-laki : " + countLakiLaki);
        System.out.println("Jumlah dosen perempuan : " + countPerempuan);
    }

    static void rataRataUsiaDosenPerJenisKelamin(dataDosen07[] arrayOfDosen) {
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;
        int countLakiLaki = 0;
        int countPerempuan = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                totalUsiaLakiLaki += arrayOfDosen[i].usia;
                countLakiLaki++;
            } else {
                totalUsiaPerempuan += arrayOfDosen[i].usia;
                countPerempuan++;
            }
        }

        double rataRataUsiaLakiLaki = (countLakiLaki > 0) ? (double) totalUsiaLakiLaki / countLakiLaki : 0;
        double rataRataUsiaPerempuan = (countPerempuan > 0) ? (double) totalUsiaPerempuan / countPerempuan : 0;

        System.out.println("Rata-rata usia dosen laki-laki : " + rataRataUsiaLakiLaki);
        System.out.println("Rata-rata usia dosen perempuan : " + rataRataUsiaPerempuan);
    }

    static void dosenTertuaDanTermuda(dataDosen07[] arrayOfDosen) {
        dataDosen07 dosenTertua = arrayOfDosen[0];
        dataDosen07 dosenTermuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen[i];
            }
            if (arrayOfDosen[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayOfDosen[i];
            }
        }

        System.out.println("Dosen tertua : ");
        dosenTertua.tampilData();
        System.out.println("Dosen termuda : ");
        dosenTermuda.tampilData();
    }

    
}
