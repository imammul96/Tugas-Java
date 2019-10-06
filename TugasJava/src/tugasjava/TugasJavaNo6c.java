/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.Scanner;

/**
 *
 * @author Imammul
 */
public class TugasJavaNo6c {
    public static void main (String[]args){
        int upah,jamkerja,totupah;
        String pesanulang="";
        
        do{
        Scanner inputjamkerja= new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        
        System.out.println("upah : Rp. 2.500");
        System.out.print("Masukkan lama jam kerja = ");
        jamkerja=inputjamkerja.nextInt();
        
        upah=2500;
        totupah =upah * jamkerja;
      
        System.out.println("Jam kerja : "+jamkerja+" jam");
        System.out.println("Rincian Jam kerja : "+jamkerja+" * "+upah);
        System.out.println("Total Upah Karyawan : Rp. "+totupah);
   
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
     
         pesanulang = dialogbaru.next();
        } 
         
        while(!pesanulang.equals("t"));
        
        
}
}    