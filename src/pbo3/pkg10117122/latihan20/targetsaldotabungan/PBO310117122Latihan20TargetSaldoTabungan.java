/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan20.targetsaldotabungan;

/**
 *
 * @author lenovo
 */
public class PBO310117122Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     * 
     * NAMA  : BONAVENTURA ALDINO SENDA SENI
     * KELAS : PBO-3
     * NIM   : 10117122
     * Deskripsi Program : menampilakan target saldo bulanan
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i; 
        int saldoAwal;
        int bunga;
        int jumlahBunga;
        int saldoTarget;
        
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        i=1;
        while (saldoAwal <= saldoTarget) {            
            jumlahBunga = saldoAwal * bunga/100;
            saldoAwal += jumlahBunga;
            
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll
                              (",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n", mataUang );
            i++;
        }
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
