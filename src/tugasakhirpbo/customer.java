/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirpbo;
import java.util.ArrayList;
/**
 *
 * @author ACER NITRO
 */
public class customer {
    
    private String nopol;
    private String kendaraan;
    private String servis;
    
    public customer(String nopol, String kendaraan, String servis){
        this.setNopol(nopol);
        this.setKendaraan(kendaraan);
        this.setServis(servis);
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getServis() {
        return servis;
    }

    public void setServis(String servis) {
        this.servis = servis;
    }
    public static void main(String[] args) {
        ArrayList<customer> listcustomer = new ArrayList<customer>();
        listcustomer.add(new customer("H 5123 GL", "Innova", "Ganti Oli dan Injektor"));
        listcustomer.add(new customer("H 2631 GD", "Avanza", "Ganti Kampas Rem"));
        listcustomer.add(new customer("H 7224","Yaris","Ganti Oli dan Ganti Filter Oli"));
    
        for (int i = 0; i < listcustomer.size(); i++){
            System.out.println("customer nomor "+(i+1));
            System.out.println("Nomor Polisi : "+ listcustomer.get(i).getNopol());
            System.out.println("Jenis kendaraan : " + listcustomer.get(i).getKendaraan());
            System.out.println("Jenis Servis : " + listcustomer.get(i).getServis());
        }
    }
}
