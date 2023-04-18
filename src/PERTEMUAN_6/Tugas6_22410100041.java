package PERTEMUAN_6;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas6_22410100041 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi
        String[][] data = new String[5][4];
        int grandTotal = 0;
        int yangdibayarkan, kembali;

        System.out.println("=== List Barang ===");
        System.out.println("-------------------");

        // List data awal pada array
        data[0][0] = "Sabun";
        data[0][1] = "1";
        data[0][2] = "3000";
        data[0][3] = "3000";

        data[1][0] = "Indomie Goreng";
        data[1][1] = "2";
        data[1][2] = "2500";
        data[1][3] = "5000";

        data[2][0] = "Le Minerale";
        data[2][1] = "2";
        data[2][2] = "3000";
        data[2][3] = "6000";

        data[3][0] = "Silverqueen";
        data[3][1] = "1";
        data[3][2] = "14000";
        data[3][3] = "14000";

        data[4][0] = "Sunsilk 400ml";
        data[4][1] = "1";
        data[4][2] = "20000";
        data[4][3] = "20000";

        // Menampilkan data list awal array
        System.out.println("Nama Barang \t\t Qty \t\t Harga \t\t Total");
        for (int bar = 0; bar < data.length; bar++) {
            for (int i = 0; i < data[bar].length; i++) {
                System.out.format(data[bar][i] + "|\t|\t");
            }
            System.out.println("");
            grandTotal += Integer.parseInt(data[bar][3]);
        }
        System.out.println("Grand Total \t = \t\t\t\t" + grandTotal);

        // Masukkan nominal yang dibayarkan sesuai list
        System.out.print("Uang Dibayarkan: ");
        yangdibayarkan = Integer.parseInt(br.readLine());

        // Perhitungan kembalian
        kembali = yangdibayarkan - grandTotal;

        // Tampilan yang dibayar
        System.out.println("Uang Dibayarkan\t\t\t\t" + yangdibayarkan);
        System.out.println("Kembali\t\t\t\t\t" + kembali);


    }
}

