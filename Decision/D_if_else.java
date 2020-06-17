/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decision;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class D_if_else {
    public static void main(String[] args) {
        //soal 2.B.1 decision if/else
        Scanner inputpilihan = new Scanner(System.in);
        System.out.println(" >>Chek Your Verification<<");
        System.out.println("  saya bukan Robot \n");
        System.out.println("   1.yes \n   2.No");
        System.out.println("Answer : ");
        int pilihan = inputpilihan.nextInt ();
        
        if (pilihan==1){
            System.out.println("\n Verifikasi yang Anda lakukan berhasil !");
        }
        else {
            System.out.println(" 404 Not Fount \n *halaman yang anda buka1 telah dilindungi pihak terkait*");
        }
    }
    
}

