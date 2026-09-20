package model;


public class Member {
    private int idMember;
    private String namaMember;
    private String noTelepon;
    private String jenisKelamin;
    private String tanggalLahir;

    public Member(int idMember, String namaMember, String noTelepon, String jenisKelamin, String tanggalLahir) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.noTelepon = noTelepon;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
    }

    public int getIdMember() {
        return idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    
}
