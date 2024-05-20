/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class MyDate {
    private final int tahun;
    private final int bulan;
    private final int hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + hari;
    }
}
