import java.util.Scanner;

public class Tugas11 {
    public static int sumRecursive(int[] numbers, int index) {
        return (index == numbers.length) ? 0 : numbers[index] + sumRecursive(numbers, index + 1);
    }

    public static int sumIterative(int[] numbers) {
        int total = 0;
        for (int num : numbers) total += num;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Hitung Total Angka dengan Gaya Anda!");
            System.out.print("Berapa banyak angka yang ingin Anda masukkan? ");
            int N = input.nextInt();
            int[] angka = new int[N];

            for (int i = 0; i < N; i++) {
                System.out.printf("Masukkan angka ke-%d: ", N - i);
                angka[i] = input.nextInt();
            }

            int total = sumRecursive(angka, 0);
            System.out.printf("\nTotal %d angka yang Anda masukkan adalah: %d (rekursif)\n", N, total);
            System.out.printf("Total (versi iteratif) adalah: %d\n", sumIterative(angka));
            System.out.println("\nTerima kasih sudah menghitung bersama kami!");

            System.out.print("Apakah Anda ingin mengulang? (y/n): ");
            String response = input.next();
            repeat = response.equalsIgnoreCase("y");
            System.out.println();
        }
    
        System.out.println("Program selesai. Sampai jumpa!");
    }
}
