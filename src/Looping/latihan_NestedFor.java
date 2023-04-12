package Looping;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class latihan_NestedFor {
    private static Scanner input;

    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        //variabel
        int minggu, hari;

        //input
        System.out.print("Jumlah minggu : ");
        minggu= Integer.parseInt(br.readLine());
        System.out.print("Jumlah hari : ");
        hari = Integer.parseInt(br.readLine());

        ///perulangan + output
        for (int i = 1; i <= minggu ; i++) {
            System.out.println("Minggu ke - " + i);

            //inner loop; kolom
            for (int j = 1; j <= hari ; j++) {
                //jika ingin tidak memunculkan hari pada minggu tertentu
                if (i> 4){
                    break;
                }
                System.out.println("Hari : " + j );

            }

         */

        /* int jumlahBaris = 5;

        //perulangan membuat baris bintang
        Scanner input = new Scanner(System.in);
        System.out.println("jumlahBaris");

        int i, j;

        System.out.print("Masukkan jumlah baris= ");
        jumlahBaris = input.nextInt();

        for (i = 1; i <= jumlahBaris; i++) {
            for (j = 1; j <= jumlahBaris; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        /*
         */

        {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah baris: ");
            int n = input.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }
}

