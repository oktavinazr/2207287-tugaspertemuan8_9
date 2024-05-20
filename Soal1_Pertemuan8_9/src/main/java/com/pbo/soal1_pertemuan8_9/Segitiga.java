/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal1_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Segitiga extends ObjekGeometris {
    // Bidang data untuk sisi-sisi segitiga
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    // Konstruktor tanpa argumen yang membuat segitiga default
    public Segitiga() {
        this.sisi1 = 1.0;
        this.sisi2 = 1.0;
        this.sisi3 = 1.0;
    }
    
    // Konstruktor yang membuat segitiga dengan sisi-sisi yang ditentukan
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    // Metode pengakses untuk ketiga bidang data
    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
    
    // Metode yang mengembalikan luas segitiga
    public double getArea() {
        double s = (sisi1 + sisi2 + sisi3) / 2.0;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
    
    // Metode yang mengembalikan perimeter segitiga
    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }
    
    // Metode yang mengembalikan deskripsi string untuk segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi 1 = " + sisi1 + " sisi 2 = " + sisi2 + " sisi 3 = " + sisi3;
    }
}
