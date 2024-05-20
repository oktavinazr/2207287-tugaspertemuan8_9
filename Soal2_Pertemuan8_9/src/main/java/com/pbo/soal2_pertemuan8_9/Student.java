/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private final String status;

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}
