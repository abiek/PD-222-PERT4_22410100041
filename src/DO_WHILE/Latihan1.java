package DO_WHILE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Latihan1 {
    public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        //Letakkan variabel sebelum blok try agar terbaca di dalam blok try-catch
        int NIM, i=0;
        String nama;

        //try catch untuk error
        try {
            do {
                System.out.print("Masukkan NIM = ");
                NIM = Integer.parseInt(br.readLine());
                System.out.print("Entri nama = ");
                nama = br.readLine();
                i++;
            }while (i < 5);
        }catch (Exception e) {

        }

         */

        //deklarasi
        String NIMMHS = null, namaMHS = "", prodi = "", mk = "", cari = "";
        int menu, uts, uas, tugas, nilaiAkhir = 0;

        try {
            /*membuat program dengan menu
            1. Masukkan Mahasiswa (NIM, nama, prodi, mk)
            2. Hitung nilai mahasiswa (uts, uas, tugas)
            3. Lihat rapor mahasiswa
            4. Keluar program
             */
            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("Masukkan Mahasiswa");
                System.out.println("Hitung Nilai MK Mahasiswa");
                System.out.println("Lihat rapor Mahasiwa");
                System.out.println("Keluar Program");
                menu = Integer.parseInt(br.readLine());


                // mengisi logika setiap menu (percabangan; if, switch-case)
                switch (menu) {
                    /*
                    if (menu ==1){
                    }else if (menu ==2){
                    }else{else dalam if-else if = default)
                    }
                     */
                    case 1:
                        System.out.println("=== Menu Entri Mahasiswa ===");
                        System.out.print("Masukkan NIM Mahasiswa : ");
                        NIMMHS = br.readLine();
                        System.out.print("Masukkan Nama Mahasiswa : ");
                        namaMHS = br.readLine();
                        System.out.print("Masukkan Prodi Mahasiswa : ");
                        prodi = br.readLine();
                        System.out.print("Masukkan Mata Kuliah Mahasiswa : ");
                        mk = br.readLine();
                        System.out.println();
                        break; //artinya berhenti proses case 1 dan mengembalikan ke perulangan awal (menu awal)

                    case 2:
                        System.out.println("=== Menu Hitung Nilai Mahasiswa ===");
                        //hitung nilai akhir (30% * uts + 30% * uas + 40% * tugas
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(NIMMHS)) {
                            //jika sesuai, entri nilai. jika tidak, ada pesan "data tidak ditemukan"
                            System.out.print("Masukkan nilai UTS : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan nilai UAS : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan nilai tugas : ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100);

                            //cetak nilai akhir
                            System.out.println("Nilai akhir : " + nilaiAkhir);
                            System.out.println();

                        } else {
                            System.out.println("Data tidak ditemukan");

                        }

                        break;

                    case 3:
                        System.out.println("==== Menu Lihat Rapor ====");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(NIMMHS)) {
                            System.out.println(NIMMHS + " " + namaMHS);
                            System.out.println("Nilai akhir MK " + ": " + nilaiAkhir);
                        }
                        /*
                        A = 80-100
                        B+ = 75-79
                        B = 65-74
                        C+ = 60-64
                        C = 55- 59
                        Nilai < 55 == D/E
                         */

                        if(nilaiAkhir >= 80 && nilaiAkhir <=100){
                            System.out.println("Nilai huruf : A");
                        } else if(nilaiAkhir >= 75 && nilaiAkhir <=79){
                            System.out.println("Nilai huruf : B+");
                        } else if(nilaiAkhir >= 65 && nilaiAkhir <=74) {
                            System.out.println("Nilai huruf : B");
                        } else if(nilaiAkhir >= 60 && nilaiAkhir <=64){
                            System.out.println("Nilai huruf : C+");
                        } else if(nilaiAkhir >= 55 && nilaiAkhir <=59) {
                            System.out.println("Nilai huruf : C");
                        } else {
                            System.out.println("Nilai akhir D/E");
                        }

                        break;
                    default: //jika yang dipilih di luar 1-3, maka
                        System.out.println("sekian terima kasih, selamat berkreasi:)");
                        System.exit(0);

                }

            }while (menu < 4); //boleh diisi true
        }catch (Exception e){
            System.out.println("Terdapat kesalahan bambank:) --> " + e.getMessage());

        }
    }
}
