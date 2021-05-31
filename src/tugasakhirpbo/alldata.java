package tugasakhirpbo;
import java.util.ArrayList;

public class alldata {
    public static datakendaraan getArraydatakendaraan(ArrayList<datakendaraan> obj, int id){
        for (int i = 0; i <obj.size(); i++){
            if (obj.get(i).getTahun() ==id){
                return obj.get(i);
            }
        }
    return null;
    }
    public static dataservis getArraydataservis(ArrayList<dataservis> obj , int id){
                for (int i = 0; i <obj.size(); i++){
            if (obj.get(i).getKilometer() ==id){
                return obj.get(i);
            }
 }
 return null;
    }
public static void main(String[] args) {
    // data customer
ArrayList<datacustomer> Listdatacustomer = new ArrayList<datacustomer>();
Listdatacustomer.add(new datacustomer("Aziz", "Rembang"));
Listdatacustomer.add(new datacustomer("Taris", "Kendal"));
Listdatacustomer.add(new datacustomer("Daru", "Semarang"));

// data kendaraan
ArrayList<datakendaraan> Listdatakendaraan = new ArrayList<datakendaraan>();
Listdatakendaraan.add(new datakendaraan("Avanza", 2010));
Listdatakendaraan.add(new datakendaraan("Yaris", 2011));
Listdatakendaraan.add(new datakendaraan("Innova", 2012));

// data servis
ArrayList<dataservis> Listdataservis = new ArrayList<dataservis>();
Listdataservis.add(new dataservis(5000, "Ganti Oli"));
Listdataservis.add(new dataservis(10000,"Ganti Oli dan Cuci Injektor"));
Listdataservis.add(new dataservis(15000,"Ganti Oli , Ganti Filter Oli , Ganti Filter Udara"));

for (int i = 0; i < Listdatacustomer.size(); i++){
    System.out.println("------------------------------Servis Mobil-----------------------------");
    System.out.println("Customer " + (i+1));
    System.out.println("Nama : "+ Listdatacustomer.get(i).getNama());
    System.out.println("Alamat : "+ Listdatacustomer.get(i).getAlamat());
    System.out.println("Type Kendaraan : "+ Listdatakendaraan.get(i).getJenis_kendaraan());
    System.out.println("Tahun Kendaraan : "+Listdatakendaraan.get(i).getTahun());
    System.out.println("Kilometer kendaraan : "+Listdataservis.get(i).getKilometer());
    System.out.println("Servis yang dilakukan : "+Listdataservis.get(i).getServis());
    System.out.println(" ");
}
}
}