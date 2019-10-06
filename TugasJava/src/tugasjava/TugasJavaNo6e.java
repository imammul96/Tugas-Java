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
public class TugasJavaNo6e {
    public static void main (String[]args){
        byte tujuan;
        int ongkossby,ongkosbdg;
        String inputbaru="";
                
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        
        do{
        System.out.println("1. Kota Surabaya");
        System.out.println("2. Kota Bandung");
        
        System.out.print("Pilih tujuan = ");
        tujuan = inputtujuan.nextByte();
        
        switch(tujuan){
            case 1:
                ongkossby = 169*2500;
                System.out.println("Tujuan Surabaya");
                System.out.println("Biaya Pengiriman : 169 x 2500= Rp."+ongkossby);
                break;
            case 2:
                ongkosbdg = 452*4000;
                System.out.println("Tujuan Bandung");
                System.out.println("Biaya Pengiriman : 452 x 4000= Rp."+ongkosbdg);
                break;
            default:
                System.out.println("Pilihan tidak ada !");
                break;
            
        }
        System.out.print("Apakah ingin input baru ? y/t = ");
        
        inputbaru = dialogbaru.next();
        }while(!inputbaru.equals("t"));

       
        
        
    }
}


