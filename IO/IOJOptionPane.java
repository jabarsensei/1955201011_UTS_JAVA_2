/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class IOJOptionPane {
    public static void main(String[] args) {
        //2.A.3 IO type JOptionPane
       
        System.out.println("Operasi Hitung Luas Lingkaran \n L= 3.14 x r^2");
        String inputr= JOptionPane.showInputDialog("panjang jari-jari lingkaran");
        double r=Integer.parseInt(inputr);
        double hasil= 3.14*r*r ;
        System.out.println("L= 3.14 x "+ r*r + " = "+ hasil +"cm^2");
        
    }
}
