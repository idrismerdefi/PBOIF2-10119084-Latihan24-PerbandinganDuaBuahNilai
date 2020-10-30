/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan24.perbandinganduabuahnilai;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan perbandingan dua buah nilai
 **/
import java.util.Scanner;
public class PBOIF210119084Latihan24PerbandinganDuaBuahNilai {
    public static void banding(int nilai1,int nilai2){
        if(nilai1==nilai2){
            System.out.println("Hasil : " + nilai1 + " sama dengan" + nilai2);
        }else if(nilai1>nilai2){
           System.out.println("Hasil : " + nilai1 + " lebih besar dari " + nilai2); 
        }else{
            System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
        }
    }
    public static void main(String[] args) {
        int nilai1 = 0;
        int nilai2 = 0;
        String ulang;
        boolean kondisi;
        
        System.out.println("======Program Perbandimngan Nilai");
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Masukkan nilai pertama ; ");
            nilai1 = input.nextInt();
            
            System.out.print("Masukkan nilai kedua ; ");
            nilai2 = input.nextInt();
            
            banding(nilai1,nilai2);
            System.out.println("");
            System.out.println("Ulangi Aktifitas ? (YA/Tidak): ");
            ulang = input.next();
            kondisi = "Ya".equals(ulang);
            System.out.println(kondisi);
            
        }while(kondisi == true);
        System.out.println("===============================================");
        System.out.println("Developed by Muhammad Idris Merdefi");
    }
    
}
