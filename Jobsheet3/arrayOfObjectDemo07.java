package Jobsheet3;

public class arrayOfObjectDemo07 {
    public static void main(String[] args) {
        arrayOfObject07[] arrayOfObject = new arrayOfObject07[7];

        arrayOfObject[0] = new arrayOfObject07();
        arrayOfObject[0].panjang = 10;
        arrayOfObject[0].lebar = 5;

        System.out.println("Panjang: " +arrayOfObject[0].panjang);
        System.out.println("Lebar: " +arrayOfObject[0].lebar);
        System.out.println("Luas: " +arrayOfObject[0].hitungLuas());
        System.out.println("Keliling: " +arrayOfObject[0].hitungKeliling());

        System.out.println("==============================");
    }
    
}
