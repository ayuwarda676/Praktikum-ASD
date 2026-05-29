package Jobsheet10.P2Jobsheet10;

public class antrianKRS07 {

    mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public antrianKRS07(int max) {
        this.max = max;
        data = new mahasiswa07[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahProses = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(mahasiswa07 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian");
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        } else {
            System.out.println("Mahasiswa yang diproses:");
            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        } else {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            int kedua = (front + 1) % max;
            data[kedua].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahProses() {
        return sudahProses;
    }

    public int belumProses() {
        return 30 - sudahProses;
    }
}