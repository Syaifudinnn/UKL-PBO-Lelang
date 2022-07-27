
package Lelang;
import java.util.ArrayList;
import java.util.Scanner;

public class Masyarakat implements User{
    
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Masyarakat(){
        this.namaMasyarakat.add("Adn");
        this.alamat.add("Kepanjen");
        this.telepon.add("08992551783");
        
        this.namaMasyarakat.add("Rendy");
        this.alamat.add("Penarukan");
        this.telepon.add("0987654321");
        
        this.namaMasyarakat.add("Faiz");
        this.alamat.add("Cepokomulyo");
        this.telepon.add("0123456789");
    }
    
    //SETTER
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
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
    public String getNama (int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }
    
    @Override
    public String getAlamat (int idMasyarakat){
        return this.alamat.get(idMasyarakat);
    }
    
    @Override
    public String getTelepon (int idMasyarakat){
        return this.telepon.get(idMasyarakat);
    }
    
}
