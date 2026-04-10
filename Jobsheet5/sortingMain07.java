package Jobsheet5;

public class sortingMain07 {
    public static void main(String[] args) {
    int a[] = {20, 10, 2, 7,12};
    sorting07 dataurut1 = new sorting07(a, a.length);

    System.out.println("Data awal 1");
    dataurut1.tampil();
    System.out.println("Data setelah diurutkan dengan bubble sort");
    dataurut1.bubbleSort();
    dataurut1.tampil();
    
    }
}
