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
public class TugasJavaNo6b {
    public static void main (String[]args){
    int qty,hrgprinter,total;
    double diskon,hrgdiskon,jmltot;
    String pesanulang="";
        
        Scanner inputqty = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        
        do {
        System.out.println("Printer EPSON T2 : Rp. 660.000");
        System.out.print("Masukkan jumlah beli = ");
        qty=inputqty.nextInt();
        
        hrgprinter=660000;
        total=qty*hrgprinter;
        if(total>1500000)
        {
            diskon=0.15;
            hrgdiskon =total*diskon;
            jmltot=total-hrgdiskon;
            
            System.out.println("jumlah beli = "+qty);
        System.out.println("rincian beli = "+qty+" * "+ hrgprinter);
        System.out.println("total harga = "+total);
        System.out.println("anda mendapatkan diskon = "+hrgdiskon);
        System.out.println("jumlah total = "+jmltot);
        }else{
             diskon=0;
            hrgdiskon =total*diskon;
            jmltot=total-hrgdiskon;
            System.out.println("jumlah beli = "+qty);
        System.out.println("rincian beli = "+qty+" * "+ hrgprinter);
        System.out.println("total harga = "+total);
        System.out.println("anda mendapatkan diskon = "+diskon);
        System.out.println("jumlah total = "+jmltot);
        }
        
        
        System.out.print("Apakah ingin input baru ? y/t = ");
     
         pesanulang = dialogbaru.next();
         
         }
        while(!pesanulang.equals("t"));
        System.out.println("Terimakasih!");
}
}
