package model;


public class JenisKelas {
    private int idJenis;
    private String namaJenis;
    private String level;
    private String durasi;

    public JenisKelas(int idJenis, String namaJenis, String level, String durasi) {
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
        this.level = level;
        this.durasi = durasi;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public String getLevel() {
        return level;
    }

    public String getDurasi() {
        return durasi;
    }
    
     
}
