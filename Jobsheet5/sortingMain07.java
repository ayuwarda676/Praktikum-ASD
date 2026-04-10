package Jobsheet5;

public class sortingMain07 {
    public static void main(String[] args) {
    int a[] = {20, 10, 2, 7,12};
    int b[] = {30, 20, 2, 8, 14};
    int c[] = {40, 10, 4, 9, 3};
    sorting07 dataurut1 = new sorting07(a, a.length);
    sorting07 dataurut2 = new sorting07(b, b.length);
    sorting07 dataurut3 = new sorting07(c, c.length);

    System.out.println("Data awal 1");
    dataurut1.tampil();
    System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC)");
    dataurut1.bubbleSort();
    dataurut1.tampil();

    System.out.println();
    System.out.println("Data awal 2");
    dataurut2.tampil();
    dataurut2.selectionSort();
    System.out.println("Data setelah diurutkan dengan SELECTION SORT (ASC)");
    dataurut2.tampil();

    System.out.println();
    System.out.println("Data awal 3");
    dataurut3.tampil();
    dataurut3.insertionSort();
    System.out.println("Data setelah diurutkan dengan INSERTION SORT (ASC)");
    dataurut3.tampil();

    }
}
