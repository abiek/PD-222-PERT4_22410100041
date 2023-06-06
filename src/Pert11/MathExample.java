package Pert11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MathExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //class math : int, float, double, bukan string
        //sqrt: kuadrat
        System.out.println(Math.sqrt(4.4));

        //pow: pangkat
        System.out.println(Math.pow(5.0,3));

        //random
        System.out.println(Math.random());

        /*
        item jurusan:
        1. SI
        2. DKV
        3. Manajemen

        Stack: urutan LIFO (Last in first out)
        Ketentuan:
        - import java util(ok)
        - deklarasi stack
        - push data (tambah data)
        - pop (ambil data)
        - size (lihat jumlah urutan stack)
         */

        Stack<String> stack = new Stack<>();
        //isi data --> push
        System.out.println("Nama Prodi 1 = " + stack.push("SI"));
        System.out.println("Nama Prodi 2 = " + stack.push("DKV"));
        System.out.println("Nama Prodi 3 = " + stack.push("Manajemen"));

        //lihat isi stack
        while (!stack.empty()){
            //tanda ! untuk notasi sama dengan
            System.out.println("Cetak urutan : " + stack.pop());
            System.out.println("Jumlah urutan sekarang :  " + stack.size());

        }

    }
}
