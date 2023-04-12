package Latihan_While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while
        //menjumlahkan setiap angka yang diinputkan
        //kondisi: perulangan penjumlahan akan dilakukan apabila angka yang diiinputkan >= 0
        //output: angka hasil jumlah

        /*
        int number=0, jumlah=0;
        while (number >= 0) {
            jumlah += number;
            System.out.print("Masukkan angka : ");
            number = Integer.parseInt(br.readLine());

        }
        System.out.print("Jumlah = " + jumlah);

         */
        boolean b;
        int i = 0;
        while (i < 5){
            System.out.print("Masukkan NIM = ");
            int NIM = Integer.parseInt(br.readLine());
            System.out.print("Entri nama = ");
            String nama = br.readLine();
            i++;
        }
    }
}
