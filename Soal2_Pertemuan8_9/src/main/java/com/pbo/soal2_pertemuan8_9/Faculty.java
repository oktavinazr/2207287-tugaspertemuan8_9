/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Faculty extends Employee {
    private final int jamKerja;
    private final String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}
