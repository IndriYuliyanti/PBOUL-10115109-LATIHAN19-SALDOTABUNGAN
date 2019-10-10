/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author nama : indri yuliyanti
 *         nim  : 10115109
 *          kls : pbo ulang
 *          tugas ke 2 TARGET SALDO TABUNGAN
 */
public class Pboulang10115109Latihan19Saldotabungan {

   
    static int saldoAkhir;
    static void hitung(int a,int b){
        saldoAkhir = (a+(a*b/100));
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal;
        int bunga;
        int lamaMenabung;
        int banyakBulan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("masukan saldo awal=");
        saldoAwal = in.nextInt();
        System.out.print("masukan bunga (dalam%)=");
        bunga = in.nextInt();
  System.out.print("Masukkan lama menabung (dalam bulan)= ");
  banyakBulan = in.nextInt();
  System.out.println("");
  System.out.println("------------------------------------------------------------------------");

  
  
  for (lamaMenabung=1; lamaMenabung<=banyakBulan; lamaMenabung++) {
   hitung(saldoAwal,bunga);
   
     
   System.out.println("Bulan ke "+lamaMenabung);
   System.out.println("Saldo awal= "+saldoAwal);
   System.out.println("Bunga= "+bunga+"% per bulan, jadi bunga yang anda dapat= "+saldoAwal*bunga/100);
   System.out.println("Saldo akhir anda adalah= "+saldoAkhir);
   System.out.println("------------------------------------------------------------------------");
   saldoAwal = saldoAkhir;

  }   
        System.out.println("");
        System.out.println("  develop BY: indri yuliyanti  ");
        
    
 
        
        
    }
    
}