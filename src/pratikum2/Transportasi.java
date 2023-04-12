package pratikum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transportasi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int penumpang = 0;
        System.out.println("---- Layanan Transportasi ----"); //header
        System.out.print("Masukkan jumlah penumpang anda : ");
        penumpang = Integer.parseInt(br.readLine());

        int bus = penumpang / 50;
        int vbus = penumpang % 50;

        int minibus = vbus / 15;
        int vminibus = vbus % 15;

        int mobil = vminibus /7;
        int vmobil = vminibus % 7;

        int sisa = mobil;

        if (sisa != 0){
            mobil = mobil + 1;
        }


        System.out.print("Kebutuan Bus "+bus+", Minibus "+minibus+", Mobil "+mobil+"");

        System.out.println("");


    }

}
