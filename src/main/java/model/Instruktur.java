package model;


public class Instruktur {
    private int idInstruktur;
    private String namaInstruktur;
    private String jenisKelamin;
    private String spesialisasi;
    private String noTelepon;
    private String domisili;

    public Instruktur(int idInstruktur, String namaInstruktur,String jenisKelamin,String spesialisasi, String noTelepon, String domisili) {
        this.idInstruktur = idInstruktur;
        this.namaInstruktur = namaInstruktur;
        this.jenisKelamin = jenisKelamin;
        this.spesialisasi = spesialisasi;
        this.noTelepon = noTelepon;
        this.domisili = domisili;
    }

    public int getIdInstruktur() {
        return idInstruktur;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getDomisili() {
        return domisili;
    }
}
