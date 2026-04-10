package Jobsheet5;

public class mahasiswaBerprestasi07 {
    mahasiswa07 [] listMhs = new mahasiswa07[5];
    int idx;

    void tambah(mahasiswa07 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (mahasiswa07 m : listMhs){
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    mahasiswa07 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
}