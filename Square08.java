package Perulangan;
import java.util.Scanner;
public class Square08 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i= 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
     }
}