/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biomontir;

/**
 *
 * @author kahfi
 */
public class datadiri {
    private String nama;
    private int nomorhp;
    
    public datadiri(){
        
    }
    
    public datadiri(String nama,int nomorhp){
       this.nama = nama;
       this.nomorhp = nomorhp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(int nomorhp) {
        this.nomorhp = nomorhp;
    }
    
    public void cetak(){
        System.out.println("");
    }
    
    
}
