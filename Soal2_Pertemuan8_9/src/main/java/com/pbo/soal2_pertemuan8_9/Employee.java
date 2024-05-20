/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Employee extends Person {
    private final String kantor;
    private final double gaji;
    private final MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKantor: " + kantor + "\nGaji: " + gaji + 
                "\nTanggal Dipekerjakan: " + tanggalDipekerjakan;
    }
}
