import java.util.Scanner;

public class Percobaan3_11 {
    static double  hitungLaba (double saldo, int tahun){
        if(tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun): ");
        int tahun = sc.nextInt();
        double saldoAkhir = hitungLaba(saldoAwal, tahun);
        System.out.println("Jumlah saldo setelah " + tahun + " tahun: " + saldoAkhir);
    }
}