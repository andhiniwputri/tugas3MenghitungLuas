/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3MenghitungLuas;
import java.io.*;
import java.util.*;
/**
 *
 * @author Acer
 */
public class tugas3MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Persegi{
    static void Hitungpersegi (int sisi){
        int formula = sisi*sisi;

        System.out.print(formula);
    }
}

class Segitiga{
    static void Hitungsegitiga (int tinggi, int alas){
        int formula = alas*tinggi/2;

        System.out.print(formula);
    }
}

class Lingkaran{
    static void Hitunglingkaran (int jari){
        if (jari == 7){
            double formula = 22/7*jari*jari;
            int akhir = (int) formula;

            System.out.print((double)akhir);
        }
        else {
            double formula = 3.14*jari*jari;
            int akhir = (int) formula;

            System.out.print((double) akhir);
        }
    }

}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner input = new Scanner (System.in);

        Lingkaran lingkaran1 = new Lingkaran();
        Persegi persegi1 = new Persegi();
        Segitiga segitiga1 = new Segitiga();

        int sisi, tinggi, alas, jari;
        int menu = input.nextInt();

        if (menu == 1){
            sisi = input.nextInt();

            persegi1.Hitungpersegi(sisi);
        }

        else if (menu == 2){
            tinggi = input.nextInt();
            alas = input.nextInt();

            segitiga1.Hitungsegitiga(tinggi, alas);
        }

        else if (menu == 3){
            jari = input.nextInt();

            lingkaran1.Hitunglingkaran(jari);
        }

        else {
            System.out.print("Input yang anda masukan tidak sesuai");
        }
    }
}