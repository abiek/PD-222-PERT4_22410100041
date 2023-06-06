package Pert11;
import java.util.Scanner;

public class Pratikum_Aritmatematika {

    public static double penjumlahan(double bilangan1, double bilangan2) {
        return bilangan1 + bilangan2;
    }

    public static double pengurangan(double bilangan1, double bilangan2) {
        return bilangan1 - bilangan2;
    }

    public static double perkalian(double bilangan1, double bilangan2) {
        return bilangan1 * bilangan2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = penjumlahan(bilangan1, bilangan2);
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            hasil = pengurangan(bilangan1, bilangan2);
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (pilihan == 3) {
            hasil = perkalian(bilangan1, bilangan2);
            System.out.println("Hasil perkalian: " + hasil);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}






