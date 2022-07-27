
package Lelang;
import java.util.ArrayList;

public class Lelang {
    
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    public Lelang(){
        this.idPenawar.add(1);
        this.idBarang.add(1);
        this.hargaTawar.add(100000);
    }
    
    //SEETTER
    public void setIdPenawar(int idPenawar){
        this.idPenawar.add(idPenawar);
    }
    
    public void setIdBarang(int idBarang){
        this.idBarang.add(idBarang);
    }
    
    public void setHargaTawar(int harga){
        this.hargaTawar.add(harga);
    }
    
    //GETTER
    public int getIdPenawar(int id){
        return this.idPenawar.get(id);
    }
    
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    
    public int getHargaTawar(int id){
        return this.hargaTawar.get(id);
    }
    
}
