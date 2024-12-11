import java.util.Scanner;

public class Percobaan305 {

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(100000,3));
        }
    }
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc05.nextInt();
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc05.nextInt();
        System.out.println("Jumlah saldo setelah " + tahun + "tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}