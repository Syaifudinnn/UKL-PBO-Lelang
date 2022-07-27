
package Lelang;

public class Laporan {
    
     public void laporan(Transaksi tr, Barang br){
        int x = tr.namaBarang.size();
        
        System.out.println("Laporan Barang Lelang");
        System.out.println("Nama \tHarga Awal \tStatus");
        for(int i = 0; i < x; i++){
            System.out.println(tr.namaBarang.get(i) + "\t" + tr.hargaAwal.get(i) + "\t" + br.getStatus(i));
        }
    }
    
    public void laporan(Transaksi tr, Barang brg, Lelang lel){
        int x = tr.hargaTawar.size();
        
        System.out.println("");
        System.out.println("Laporan Transaksi Lelang");
        System.out.println("Nama \tId Pembeli \tLaba");
        for(int i = 0; i < x; i++){
            int laba = lel.getHargaTawar(i) - brg.getHargaAwal(i);
            System.out.println(tr.namaBarang.get(i) + "\t\t"+ tr.idMasyarakatPenawar.get(i) +"\t\t" + laba);
        }
    }
    
}
