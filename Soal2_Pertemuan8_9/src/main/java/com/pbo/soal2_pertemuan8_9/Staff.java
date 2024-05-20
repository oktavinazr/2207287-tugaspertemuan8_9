/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Staff extends Employee {
    private final String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGelar: " + gelar;
    }
}
