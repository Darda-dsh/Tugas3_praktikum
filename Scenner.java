package Tugas3_praktikum;

import java.util.Scanner;

public class Scenner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Scanner: ");
        String nama = input.nextLine();
        System.out.println("Hai, " + nama);
    }    
}
