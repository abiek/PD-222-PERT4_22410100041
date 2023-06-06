package Pert11;

import java.io.*;
public class Pert11 {
    //parameter: variabel tampung sementara di sebuah fungsi/prosedur
    //fungsi berparameter aaray untuk menghitung rata-rata nilai (angka)

    public static int AvgArray(int[] data){

        //deklarasi variabel tampung lain untuk memproses suatu perhitungan
        int jml=0, rata=0;
        //rata-rata (jumlah nilai/jumlah data)
        for (int i = 0; i < data.length; i++) {
            //penjumlahan nilai
            jml += data[i];
        }
        rata = jml/data.length;

        return rata;
    }
    public static void terserah() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d[] = {1,2,4,7};

        //data dinamis: data dari inputan user (isi angka dari inputan user
        int d1[] = new int[3];
        for (int i = 0; i < d1.length; i++) {
            System.out.print("Isi angka : ");
            d1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(AvgArray(d1));

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        terserah();

    }
}
