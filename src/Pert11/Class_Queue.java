package Pert11;

import java.util.LinkedList;
import java.util.Queue;

public class Class_Queue {

    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        String[] jadwalfilm = {"Film A", "Film B", "Film C", "Film D"};

        // Menambahkan pesanan tiket ke dalam antrian
        ticketQueue.add("Penonton 1");
        ticketQueue.add("Penonton 2");
        ticketQueue.add("Penonton 3");

        // Memproses pesanan tiket dan menampilkan jadwal film
        while (!ticketQueue.isEmpty()) {
            String customer = ticketQueue.poll();
            System.out.println("Pesanan tiket untuk " + customer + " diproses.");
            System.out.println("Jadwal film saat ini: " + jadwalfilm[0]);

            // Menggeser jadwal film ke posisi berikutnya
            String temp = jadwalfilm[0];
            for (int i = 1; i < jadwalfilm.length; i++) {
                jadwalfilm[i - 1] = jadwalfilm[i];
            }
            jadwalfilm[jadwalfilm.length - 1] = temp;
        }
    }
}

