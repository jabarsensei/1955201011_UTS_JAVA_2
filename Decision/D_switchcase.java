/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decision;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class D_switchcase {
    public static void main(String[] args) {
        //soal 2.B.2 switch and case
      System.out.println("->>PENENTUAN JUMLAH HARI DALAM SATU BULAN<<- \n");
      String inputtahun=JOptionPane.showInputDialog("Inputkan Tahun");
      int tahun = Integer.parseInt (inputtahun);
      String inputbulan=JOptionPane.showInputDialog ("Urutan Bulan ke");
      int bulan = Integer.parseInt (inputbulan);
      int hari = 0; 
      
      switch (bulan){
            case 2:
                if ( tahun %4==0)
                    hari = 29;
                else 
                    hari = 28;
                
                break;
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                hari = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                hari = 30;
                break;
            default:
                
                System.out.println(" NB:_maaf data yang anda inputkan tidak VALID \n jumlah bulan adalah 12 dalam satu tahun_ \n");
      }
        System.out.println("*jumlah hari pada bulan "+bulan+" tahun "+tahun+"\n sebanyak "+hari+" hari");
    }
    
}
