import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pert10 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Masukkan alas : ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("Masukkan tinggi : ");
            double t = Double.parseDouble(br.readLine());

            //hitung luas segitiga (memanggil fungsi)
            luasSegitiga(a,t);

            //cetak luas
            System.out.println("luas segitiga adalah "+luasSegitiga(a,t));

            //cetak dari prosedur
            cetakLuas();

        }catch (Exception e){
            System.err.println("Data salah");

        }
    }
    //membuat fungsi/prosedur
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5*alas*tinggi;
    }

    //membuat prosedur untuk menampilkan hasil fungsi luas segitiga
    //void ; prosedur & double ; fungsi
    //fungsi : penulisan dengan tipe data dan ada return value
    //prosedur : penulisan dengan void
    public static void cetakLuas(){
        //prosedur bisa memanggil fungsi, bisa menggunakan java.IO, bisa menggunakan array, dsb.
        System.out.println("Luas segitiga : " + luasSegitiga(5, 5));
    }

    //mengelompokkan inputan user ke dalam prosedur
    public static void inputDataLuasSegitiga() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
}
