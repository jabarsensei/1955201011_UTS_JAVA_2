/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class IOscanner {
    public static void main(String[] args) {
        // 2.A.2 pembuatan input output Scanner
        
        System.out.println("**Operasi Penghitungan Luas Persegi** \n");
        Scanner inputnilaisisi = new Scanner (System.in);
        System.out.println("  Inputkan panjang sisi persegi =");
        double nilai = inputnilaisisi.nextInt();
        double luas = nilai*nilai;
        System.out.println("  Luas persegi : " + luas + " cm^2");
        
    }

}
