/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.soal1_pertemuan8_9;

import java.util.Scanner;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Soal1_Pertemuan8_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga sisi segitiga dan memeriksa kondisi
        double sisi1, sisi2, sisi3;
        while (true) {
            System.out.print("\nAturan : sisi1 + sisi2 > sisi3, sisi1 + sisi3 > sisi2, "
                    + "sisi2 + sisi3 > sisi1\n");
            System.out.print("Masukkan sisi 1: ");
            sisi1 = input.nextDouble();
            System.out.print("Masukkan sisi 2: ");
            sisi2 = input.nextDouble();
            System.out.print("Masukkan sisi 3: ");
            sisi3 = input.nextDouble();
            
            if (sisi1 > 0 && sisi2 > 0 && sisi3 > 0 && 
                (sisi1 + sisi2 > sisi3) && 
                (sisi1 + sisi3 > sisi2) && 
                (sisi2 + sisi3 > sisi1)) {
                break;
            } else {
                System.out.println("Nilai sisi tidak valid. Sisi-sisi harus "
                        + "lebih besar dari 0 dan memenuhi aturan segitiga.");
            }
        }
        
        // Meminta pengguna memasukkan warna
        System.out.print("Masukkan warna: ");
        String color = input.next();
        
        // Meminta pengguna memasukkan nilai Boolean apakah segitiga diisi
        System.out.print("Apakah segitiga diisi (true/false): ");
        boolean filled = input.nextBoolean();
        
        // Membuat objek Segitiga dengan sisi-sisi ini
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);
        
        // Menampilkan luas, keliling, warna, dan benar atau salah apakah diisi atau tidak
        System.out.println("\nLuas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga diisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}
