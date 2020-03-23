package id.example.tesapk;

public class Data {
    String noberkas, namaobjek, alamat, lokasi;

    public Data( String noberkas, String namaobjek, String alamat, String lokasi) {
        this.noberkas = noberkas;
        this.namaobjek = namaobjek;
        this.alamat = alamat;
        this.lokasi = lokasi;
    }



    public String getNoberkas() {
        return noberkas;
    }

    public void setNoberkas(String noberkas) {
        this.noberkas = noberkas;
    }

    public String getNamaobjek() {
        return namaobjek;
    }

    public void setNamaobjek(String namaobjek) {
        this.namaobjek = namaobjek;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
