package Jobsheet11;
import java.util.Scanner;
public class sllMAin00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList00 Sll = new singleLinkedList00();
        for (int i = 1; i <= 4; i++) {

            System.out.println("Data Mahasiswa ke-" + i);

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa00 mhs = new mahasiswa00(nim, nama, kelas, ipk);

            Sll.addLast(mhs);
            System.out.println();
        }

        System.out.println("Isi Linked List");
        Sll.print();

    }
}

       /*  singleLinkedList00 sll = new singleLinkedList00();
        mahasiswa00 m1 = new mahasiswa00("210001", "Alvaro", "TI-1A", 3.5);
        mahasiswa00 m2 = new mahasiswa00("210002", "Bimon", "TI-1B", 3.6);
        mahasiswa00 m3 = new mahasiswa00("210003", "Cintia", "TI-1C", 3.7);
        mahasiswa00 m4 = new mahasiswa00("210004", "Dirga", "TI-1D", 3.8);

        sll.print();
        sll.addFirst(m4);
        sll.print();
        sll.addLast(m1);
        sll.print();
        sll.insertAfter("Dirga", m3);
        sll.print();
        sll.inserAt(2, m2);
        sll.print();

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();*/
    

