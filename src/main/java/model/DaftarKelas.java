package model;

public class DaftarKelas {
    private int idKelas;
    private int idMember;
    private int idInstruktur;
    private int idJenis;
    private String tanggalKelas;
    private String jamKelas;
    private String ruangan;
    private String status;

    public DaftarKelas(int idKelas, int idMember,int idInstruktur, int idJenis,String tanggalKelas,String jamKelas, String ruangan ,String status ) {

        this.idKelas = idKelas;
        this.idMember = idMember;
        this.idInstruktur = idInstruktur;
        this.idJenis = idJenis;
        this.tanggalKelas = tanggalKelas;
        this.jamKelas = jamKelas;
        this.ruangan = ruangan;
        this.status = status;
        
    }

    public int getIdKelas() {
        return idKelas;
    }

    public int getIdMember() {
        return idMember;
    }

    public int getIdInstruktur() {
        return idInstruktur;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public String getTanggalKelas() {
        return tanggalKelas;
    }

    public String getJamKelas() {
        return jamKelas;
    }

    public String getRuangan() {
        return ruangan;
    }

    public String getStatus() {
        return status;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public void setIdInstruktur(int idInstruktur) {
        this.idInstruktur = idInstruktur;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public void setTanggalKelas(String tanggalKelas) {
        this.tanggalKelas = tanggalKelas;
    }

    public void setJamKelas(String jamKelas) {
        this.jamKelas = jamKelas;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
