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
public class TugasJavaNo6d {
    public static void main (String[]args){
        int upah,jamkerja,total;
        double pajak,totupahpajak,jumlahtotal;
        String inputbaru="";
        
        do{
        Scanner inputjamkerja= new Scanner(System.in);
         Scanner dialogbaru = new Scanner(System.in);
        
        System.out.println("Upah Karyawan Per jam : Rp. 2.500");
        System.out.println("Pajak Karyawan : 15%");
        System.out.print("Masukkan lama jam kerja = ");
        jamkerja=inputjamkerja.nextInt();
        
        pajak = 0.15;
        upah=2500;
        total = upah * jamkerja;
        totupahpajak =total *pajak;
      jumlahtotal = total-totupahpajak;
      
        System.out.println("Jam kerja : "+jamkerja+" jam");
        System.out.println("Rincian Jam kerja : "+jamkerja+" * "+upah);
        System.out.println("Total Sebelum Pajak : Rp."+total);
        System.out.println("Jumlah Pajak: Rp."+totupahpajak);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Total Upah Karyawan : Rp. "+jumlahtotal);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
   
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
     
         inputbaru = dialogbaru.next();
        } 
         
        while(!inputbaru.equals("t"));
        
        
}
}    

    

