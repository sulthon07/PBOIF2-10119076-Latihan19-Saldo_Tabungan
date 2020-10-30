/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan19.saldo.tabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 */
public class PBOIF210119076Latihan19SaldoTabungan {

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int lama,i;
        String hasil;
        float bunga;
        double saldoAwal, saldoTotal;
        
        System.out.print("Saldo Awal    : Rp. ");
        saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%)    : ");
        bunga=input.nextFloat();
        System.out.print("Lama(bulan)    : ");
        lama=input.nextInt();
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
        
        
        for (i=1;i<=lama;i++){
            //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        
            saldoTotal = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoTotal));
            saldoAwal = saldoTotal;
            
        }
        System.out.println("_________________________________");
        System.out.println("Developed by Sulthon Naufal Akmal");
    }
}
        
        
        
        
    
        
         