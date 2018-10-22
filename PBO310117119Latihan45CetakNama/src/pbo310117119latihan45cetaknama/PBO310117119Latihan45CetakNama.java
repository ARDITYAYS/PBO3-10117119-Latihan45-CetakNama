/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan45cetaknama;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan pengulangan nama
 */
public class PBO310117119Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        Printer print = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(sca.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(sca.nextInt());

        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }

}
