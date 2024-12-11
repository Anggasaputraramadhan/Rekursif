import java.util.Scanner;

public class Penjumlahan05 {

    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1");  
            return 1;
        } else {
            System.out.print(n + "+");  
            return n + hitungPenjumlahan(n - 1);  
        }
    }
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan: ");
        n = sc05.nextInt();

        System.out.print("Hasil penjumlahan dari 1 hingga " + n + " adalah: ");
        int hasil = hitungPenjumlahan(n);

        System.out.println(" = " + hasil);
    }   
}