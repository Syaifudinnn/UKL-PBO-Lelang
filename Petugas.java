
package Lelang;
import java.util.ArrayList;

public class Petugas implements User{
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Ihsan");
        this.alamat.add("Depok");
        this.telepon.add("0689632451");
    }
    
    //SETTER
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    //GETTER
    @Override
    public String getNama (int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    
    @Override
    public String getAlamat (int idPetugas){
        return this.alamat.get(idPetugas);
    }
    
    @Override
    public String getTelepon (int idPetugas){
        return this.telepon.get(idPetugas);
    }
    
}
