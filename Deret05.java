import java.util.Scanner;

public class Deret05 {

    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");  
        deretDescendingRekursif(n - 1);  
    }
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");  
        }
    }
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int n;
        System.out.print("Masukkan bilangan n: ");
        n = sc05.nextInt();
     
        System.out.print("Deret: ");
        deretDescendingIteratif(n);
        System.out.println();  
    }
}