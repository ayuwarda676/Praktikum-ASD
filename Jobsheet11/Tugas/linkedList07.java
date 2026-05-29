package Jobsheet11.Tugas;

public class linkedList07 {
    node07 head;
    node07 tail;
    int jumlahAntrian = 0;

    boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(mahasiswa07 input) {

        node07 ndInput = new node07(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }

        jumlahAntrian++;

        System.out.println(input.nama + " berhasil masuk antrian");
    }

    public void panggilAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            System.out.println("Mahasiswa dipanggil:");

            head.data.tampilData();

            head = head.next;

            if (head == null) {
                tail = null;
            }

            jumlahAntrian--;
        }
    }

    public void lihatTerdepan() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilData();
        }
    }

    public void lihatTerakhir() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilData();
        }
    }

    public void tampilSemua() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            node07 temp = head;

            System.out.println("Daftar Antrian:");

            while (temp != null) {
                temp.data.tampilData();
                System.out.println("----------------");
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + jumlahAntrian);
    }

    public void clear() {

        head = null;
        tail = null;
        jumlahAntrian = 0;

        System.out.println("Antrian berhasil dikosongkan");
    }
}
