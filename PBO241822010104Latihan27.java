/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan27;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Format Tugas PBO");
       try (Scanner input = new Scanner(System.in)) {
           System.out.print("Masukkan Kalimat: ");
           String kalimat = input.nextLine();
           
           String kalimatBesar = kalimat.toUpperCase();
           String kalimatKecil = kalimat.toLowerCase();
           
           System.out.println("\n===Hasil Formatting===");
           System.out.println("Huruf Besar: " + kalimatBesar);
           System.out.println("Huruf Kecil: " + kalimatKecil);
       }
       System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }}

  
