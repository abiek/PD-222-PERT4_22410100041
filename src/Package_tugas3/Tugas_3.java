package Package_tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas_3 {
    public static void main(String[] args) throws IOException {

        double sks = 3;
        double totalSks = 18;
        double totalNilai;
        double IPS;
        int nilaike1;
        int nilaike2;
        int nilaike3;
        int nilaike4;
        int nilaike5;
        int nilaike6;
        String huruf1, huruf2, huruf3, huruf4 = null, huruf5 = null, huruf6;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nilai mata kuliah ke - 1 : ");
        nilaike1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 2 : ");
        nilaike2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 3 : ");
        nilaike3 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 4 : ");
        nilaike4 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 5 : ");
        nilaike5 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 6 : ");
        nilaike6 = Integer.parseInt(br.readLine());

        // KONVERSI NILAI KE BOBOT
        // Nilai ke 1
        if (nilaike1 >= 80 && nilaike1 <= 100) {
            huruf1 = "A";
        } else if (nilaike1 >= 75 && nilaike1 <= 79) {
            huruf1 = "B+";
        } else if (nilaike1 >= 65 && nilaike1 <= 74) {
            huruf1 = "B";
        } else if (nilaike1 >= 60 && nilaike1 <= 64) {
            huruf1 = "C+";
        } else if (nilaike1 >= 55 && nilaike1 <= 59) {
            huruf1 = "C";
        } else if (nilaike1 >= 40 && nilaike1 <= 54) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }

        // Nilai ke 2
        if (nilaike2 >= 80 && nilaike2 <= 100) {
            huruf2 = "A";
        } else if (nilaike2 >= 75 && nilaike2 <= 79) {
            huruf2 = "B+";
        } else if (nilaike2 >= 65 && nilaike2 <= 74) {
            huruf2 = "B";
        } else if (nilaike2 >= 60 && nilaike2 <= 64) {
            huruf2 = "C+";
        } else if (nilaike2 >= 55 && nilaike2 <= 59) {
            huruf2 = "C";
        } else if (nilaike2 >= 40 && nilaike2 <= 54) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }

        // Nilai ke 3
        if (nilaike3 >= 80 && nilaike3 <= 100) {
            huruf3 = "A";
        } else if (nilaike3 >= 75 && nilaike3 <= 79) {
            huruf3 = "B+";
        } else if (nilaike3 >= 65 && nilaike3 <= 74) {
            huruf3 = "B";
        } else if (nilaike3 >= 60 && nilaike3 <= 64) {
            huruf3 = "C+";
        } else if (nilaike3 >= 55 && nilaike3 <= 59) {
            huruf3 = "C";
        } else if (nilaike3 >= 40 && nilaike3 <= 54) {
            huruf3 = "D";
        } else {
            huruf3 = "E";
        }

        // Nilai ke 4
        if (nilaike4 >= 80 && nilaike4 <= 100) {
            huruf4 = "A";
        } else if (nilaike4 >= 75 && nilaike4 <= 79) {
            huruf4 = "B+";
        } else if (nilaike4 >= 65 && nilaike4 <= 74) {
            huruf4 = "B";
        } else if (nilaike4 >= 60 && nilaike4 <= 64) {
            huruf4 = "C+";
        } else if (nilaike4 >= 55 && nilaike4 <= 59) {
            huruf4 = "C";
        } else if (nilaike4 >= 40 && nilaike4 <= 54) {
            huruf4 = "D";
        } else {
            huruf5 = "E";
        }

        // Nilai ke 5
        if (nilaike4 >= 80 && nilaike4 <= 100) {
            huruf4 = "A";
        } else if (nilaike5 >= 75 && nilaike5 <= 79) {
            huruf4 = "B+";
        } else if (nilaike5 >= 65 && nilaike5 <= 74) {
            huruf4 = "B";
        } else if (nilaike5 >= 60 && nilaike5 <= 64) {
            huruf4 = "C+";
        } else if (nilaike5 >= 55 && nilaike5 <= 59) {
            huruf4 = "C";
        } else if (nilaike5 >= 40 && nilaike5 <= 54) {
            huruf4 = "D";
        } else {
            huruf5 = "E";
        }

        // Nilai ke 6
        if (nilaike6 >= 80 && nilaike6 <= 100) {
            huruf6 = "A";
        } else if (nilaike6 >= 75 && nilaike6 <= 79) {
            huruf6 = "B+";
        } else if (nilaike6 >= 65 && nilaike6 <= 74) {
            huruf6 = "B";
        } else if (nilaike6 >= 60 && nilaike6 <= 64) {
            huruf6 = "C+";
        } else if (nilaike6 >= 55 && nilaike6 <= 59) {
            huruf6 = "C";
        } else if (nilaike6 >= 40 && nilaike6 <= 54) {
            huruf6 = "D";
        } else {
            huruf6 = "E";
        }

        double ipk1 = 0, ipk2 = 0, ipk3 = 0, ipk4 = 0, ipk5 = 0, ipk6 = 0;

        // NILAI MATKUL KE - 1
        if (huruf1 == "A") {
            ipk1 = 4.0;
        } else if (huruf1 == "B+") {
            ipk1 = 3.50;
        } else if (huruf1 == "B") {
            ipk1 = 3.0;
        } else if (huruf1 == "C+") {
            ipk1 = 2.50;
        } else if (huruf1 == "C") {
            ipk1 = 2.0;
        } else if (huruf1 == "D") {
            ipk1 = 1.0;
        } else {
            ipk1 = 0.0;
        }

        // NILAI MATKUL KE - 2
        if (huruf2 == "A") {
            ipk2 = 4.0;
        } else if (huruf2 == "B+") {
            ipk2 = 3.50;
        } else if (huruf2 == "B") {
            ipk2 = 3.0;
        } else if (huruf2 == "C+") {
            ipk2 = 2.50;
        } else if (huruf2 == "C") {
            ipk2 = 2.0;
        } else if (huruf2 == "D") {
            ipk2 = 1.0;
        } else {
            ipk2 = 0.0;
        }

        // NILAI MATKUL KE - 3
        if (huruf3 == "A") {
            ipk3 = 4.0;
            if (huruf4 == "A") {
                ipk4 = 4.0;
            } else if (huruf4 == "B+") {
                ipk4 = 3.50;
            } else if (huruf4 == "B") {
                ipk4 = 3.0;
            } else if (huruf4 == "C+") {
                ipk4 = 2.50;
            } else if (huruf4 == "C") {
                ipk4 = 2.0;
            } else if (huruf4 == "D") {
                ipk4 = 1.0;
            } else {
                ipk4 = 0.0;
            }

            // NILAI MATKUL KE - 4
            if (huruf4 == "A") {
                ipk4 = 4.0;
            } else if (huruf4 == "B+") {
                ipk4 = 3.50;
            } else if (huruf4 == "B") {
                ipk4 = 3.0;
            } else if (huruf4 == "C+") {
                ipk4 = 2.50;
            } else if (huruf4 == "C") {
                ipk4 = 2.0;
            } else if (huruf4 == "D") {
                ipk4 = 1.0;
            } else {
                ipk4 = 0.0;
            }

            // NILAI MATKUL KE - 5
            if (huruf5 == "A") {
                ipk5 = 4.0;
            } else if (huruf5 == "B+") {
                ipk5 = 3.50;
            } else if (huruf5 == "B") {
                ipk5 = 3.0;
            } else if (huruf5 == "C+") {
                ipk5 = 2.50;
            } else if (huruf5 == "C") {
                ipk5 = 2.0;
            } else if (huruf5 == "D") {
                ipk5 = 1.0;
            } else {
                ipk5 = 0.0;
            }





            // NILAI MATKUL KE - 6
            if (huruf6 == "A") {
                ipk6 = 4.0;
            } else if (huruf6 == "B+") {
                ipk6 = 3.50;
            } else if (huruf6 == "B") {
                ipk6 = 3.0;
            } else if (huruf6 == "C+") {
                ipk6 = 2.50;
            } else if (huruf6 == "C") {
                ipk6 = 2.0;
            } else if (huruf6 == "D") {
                ipk6 = 1.0;
            } else {
                ipk6 = 0.0;
            }

            totalNilai = ipk1 * sks + ipk2 * sks + ipk3 * sks + ipk4 * sks + ipk5 * sks + ipk6 * sks;
            IPS = totalNilai / totalSks;

            System.out.println("\nNilai mata kuliah ke - 1 adalah : " + huruf1 + "\nNilai mata kuliah ke - 2 adalah : " + huruf2 + "\nNilai mata kuliah ke - 3 adalah : " + huruf3 + "\nNilai mata kuliah ke - 4 adalah : " + huruf4 + "\nNilai mata kuliah ke - 5 adalah : " + huruf5 + "\nNilai mata kuliah ke - 6 adalah : " + huruf6);
            System.out.print("IPS yang diperoleh adalah: " + IPS);


        }
    }
}
