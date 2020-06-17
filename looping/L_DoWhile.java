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
public class L_DoWhile {
    private static int Counter;
    public static void main(String[] args) {
    //
        int battery=100;
        
        do{
            System.out.println("**Statistik Penggunaan Daya Battery setiap 2 menit "+battery+" %");
            battery--;
            Counter++;
        }
        while (battery == 12);
        System.out.println("\n  BatteryBar ("+battery+" %)");
        System.out.println("  Waktu penggunaan battery selama " + Counter++ * 2+" menit");
    }
 
}
