/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.soal2_pertemuan8_9;

/**
 * @author Oktavina Zahra R - 2207287
 */
public class Soal2_Pertemuan8_9 {

    public static void main(String[] args) {
        Person person = new Person("Oktavina Zahra R", "Kiaracondong", 
                "081222884750", "oktavinazahrarahmawati@gmail.com");
        Student student = new Student("Oktavina Zahra R", "Kiaracondong", 
                "081222884750", "oktavinazahrarahmawati@gmail.com", Student.MAHASISWA_TAHUN_KEDUA);
        MyDate tanggalDipekerjakan = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Erwin", "Setiabudi", "081234567890", 
                "erwin@gmail.com", "A101", 50000, tanggalDipekerjakan);
        Faculty faculty = new Faculty("Gilang", "Setiabudi", "081345678901", 
                "gilang@gmail.com", "B202", 75000, tanggalDipekerjakan, 10, "Professor");
        Staff staff = new Staff("Joko", "Setiabudi", "081456789012", 
                "joko@gmail.com", "C303", 60000, tanggalDipekerjakan, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
