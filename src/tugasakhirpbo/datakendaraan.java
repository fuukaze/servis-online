package tugasakhirpbo;

public class datakendaraan {
    private String jenis_kendaraan;
    private int  tahun;
    
    public datakendaraan(String jenis_kendaraan, int tahun){
        this.setJenis_kendaraan(jenis_kendaraan);
        this.setTahun(tahun);
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
