/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Person {
    private final String nama;
    private final String alamat;
    private final String nomorTelepon;
    private final String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nKelas " + getClass().getSimpleName() + "\nNama: " + nama + "\nAlamat: " 
                + alamat + "\nTelepon: " + nomorTelepon + "\nEmail: " + email;
    }
}
