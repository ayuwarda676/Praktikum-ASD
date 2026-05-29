package Jobsheet11;

public class sllMAin00 {
    public static void main(String[] args) {
        singleLinkedList00 sll = new singleLinkedList00();
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
    }
    
}
