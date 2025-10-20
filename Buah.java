package Tugas3_praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli: ");
        int mangga = Integer.parseInt(br.readLine());

        System.out.print("Jumlah jambu dibeli: ");
        int jambu = Integer.parseInt(br.readLine());

        int jambuDiberi = 4 * 30;
        int manggaBusuk = 15;

        int totalBuah = (mangga - manggaBusuk) + (jambu - jambuDiberi);

        System.out.println("Total buah yang masih ada: " + totalBuah);
    }
}
