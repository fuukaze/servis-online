package tugasakhirpbo;

public class datacustomer {
    private String nama;
    private String alamat;
    
    public datacustomer(String nama, String alamat){
        this.setNama(nama);
        this.setAlamat(alamat);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}