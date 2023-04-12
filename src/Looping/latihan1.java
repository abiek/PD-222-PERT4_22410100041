package Looping;

public class latihan1 {
    public static void main(String[] args) {
        //mencetak angka 1-10
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }

            //mencetak kata i lupp yukk
            for (int i = 1; i < 101 ; i++) {
                System.out.println(("lupp yukk"));
            }

            int n = 11;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += i; //(sum = sum+i)]
            }
            //cetak hasil akhir penjumlahan (di luar for)
            System.out.println("hasil "+ sum);

            //coba penjumlahan 10+9+8+7+6+5+4+3+2+1
        int x = 10;
        for (int i = x; i > 1; i--) {
            sum += i; //(sum = sum+i)]
        }
        System.out.println(sum);



    }
}
