package Jobsheet1;
import java.util.Scanner;
public class nim07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        String duaDigitAkhir = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigitAkhir);

        if (n < 10) {
            n += 10;
        }

        int totalN = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }

            totalN++;
        }
        System.out.println();
        System.out.println("n: " + totalN);
        sc.close();
    }
    
}
