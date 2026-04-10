package Jobsheet5;

public class mahasiswaBerprestasi07 {
    mahasiswa07 [] listMhs = new mahasiswa07[5];
    int idx = 0;

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
            if (m != null){
                m.tampilInformasi();
                System.out.println("-------------------");
            }
        }
    }

    void bubbleSort(){
        for (int i = 0; i < idx - 1; i++){
            for (int j = 1; j < idx - i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    mahasiswa07 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < idx - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < idx; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa07 temp = listMhs[i];
            listMhs[i] = listMhs[idxMin];
            listMhs[idxMin] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++){
            mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}