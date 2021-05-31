package tugasakhirpbo;

public class dataservis {
    private int kilometer;
    private String servis;
    
    public dataservis(int kilometer, String servis){
        this.setKilometer(kilometer);
        this.setServis(servis);
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getServis() {
        return servis;
    }

    public void setServis(String servis) {
        this.servis = servis;
    }
}
