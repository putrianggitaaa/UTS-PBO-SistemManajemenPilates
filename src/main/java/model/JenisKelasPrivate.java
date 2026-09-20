package model;

public class JenisKelasPrivate extends JenisKelas{
     private String jenisSesi;

    public JenisKelasPrivate(int idJenis, String namaJenis, String level,
                             String durasi, String jenisSesi) {
        super(idJenis, namaJenis, level, durasi);
        this.jenisSesi = jenisSesi;
    }

    public String getJenisSesi() {
        return jenisSesi;
    }
}
