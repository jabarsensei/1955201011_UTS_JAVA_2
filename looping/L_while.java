/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;



/**
 *
 * @author HP
 */
public class L_while {
    private static int Counter;
    public static void main(String[] args) {
    int token = 20;
        System.out.println("jumlah token kistrik saat ini "+token+" Kwh \n");
    while (token>=0){
        System.out.println(token+" titt...");
        token--;
        Counter++;
    } 
    System.out.println("\n TOKEN LISTRIK Anda telah habis,silahkan isi ulang kembali");
    System.out.println(" jumlah perulangan "+ Counter++ +" kali");
    }
    
}
