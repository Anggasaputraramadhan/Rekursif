import java.util.Scanner;

public class Percobaan205 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
           
            return (x * hitungPangkat(x, y - 1));
        }
    }
    static void printDeretPangkat(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(x);  
            if (i < y - 1) {
                System.out.print(" x ");  
            }
        }
        System.out.print(" x 1 = ");  
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc05.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc05.nextInt();
        printDeretPangkat(bilangan, pangkat);

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}