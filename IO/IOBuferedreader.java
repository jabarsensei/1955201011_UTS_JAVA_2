 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class IOBuferedreader {

      public static void main(String[] args) throws IOException {
        // soal 2.A.1 IO buferedreader
        BufferedReader input=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("masukkan jari jari lingkaran = ");
        double r=Integer.parseInt (input. readLine ());
        double luaslingkaran =3.14*r*r;
        System.out.println("luas lingkaran adalah "+luaslingkaran+" cm^2");
    }
    
}

//kekurangan = tidak dapat menampilkan nilai r disamping sout+tab