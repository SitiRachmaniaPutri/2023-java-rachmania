/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uas;
import java.util.Scanner;
/**
 *
 * @author Siti Rachmania Putri
 */
public class UAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Program untuk menginput Nama dan Nilai UAS Mahasiswa, menghasilkan output skala dan status kelulusan.
        Menampilkan program dengan baik untuk nama yg memiliki 18 karakter huruf, selebihnya bisa disesuaikan*/
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int n = input.nextInt();
        
        String status[] = new String[n];
        String nama[] = new String[n];
        char skala[] = new char[n];
        int nilai[] = new int[n];
        String nim[] = new String[n];
        
        for (int i=0; i<n; i++) {
            System.out.println("Mahasiswa Ke : "+(i+1));
            System.out.print("Nama(Tanpa Spasi) : ");
            nama[i] = input.next();
            
            System.out.println("NIM : ");
            nim[i] = input.next();
            
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            
            if (nilai[i] <= 49) {
                skala[i] = 'E';
            } else if (nilai[i] >= 50 && nilai[i] <= 59){
                skala[i] = 'D';
            } else if (nilai[i] >= 60 && nilai[i] <= 69){
                skala[i] = 'C';
            } else if (nilai[i] >= 70 && nilai[i] <= 79){
                skala[i] = 'B';
            } else {
                skala[i] = 'A';
            }
            
            if (nilai[i] >= 60){
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }
        
        System.out.println(" ");
        System.out.println("                           DAFTAR NILAI UAS MAHASISWA");
        System.out.println("==================================================================================");
        System.out.println("No   Nama                               NIM             Nilai   Skala     Status");
        
        for (int i=0; i<n; i++) {
            System.out.println((i+1)+"    "+nama[i]+"                 "+nim[i]+"     "+nilai[i]+"       "+skala[i]+"       "+status[i]);
        }
    }
    
}
