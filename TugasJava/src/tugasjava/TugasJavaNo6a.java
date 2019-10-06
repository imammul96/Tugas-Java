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
public class TugasJavaNo6a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qty,hrgprinter,tot;
        String pesanulang="";
        
        Scanner tambahjml = new Scanner(System.in);
        Scanner pesanbaru = new Scanner(System.in);
        
        do {
        System.out.println("Printer EPSON T2 : Rp. 660.000");
        System.out.print("Masukkan jml beli = ");
        qty=tambahjml.nextInt();
        
        hrgprinter=660000;
        tot=qty*hrgprinter;
        System.out.println("jml beli = "+qty);
        System.out.println("rincian beli = "+qty+" * "+ hrgprinter);
        System.out.println("tot harga = "+tot);
        
        System.out.print("Apakah ingin input baru ? y/t = ");
     
         pesanulang = pesanbaru.next();
         
         }
        while(!pesanulang.equals("t"));
       
        
    
        
        
    }
    
}

   
