
package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;
import model.JenisKelas;
import model.DaftarKelas;
import model.Instruktur;
import model.JenisKelasPrivate;
import model.JenisKelasPublik;

public class service {

    private ArrayList<Member> daftarMember;
    private ArrayList<Instruktur> daftarInstruktur;
    private ArrayList<JenisKelas> daftarJenisKelas;
    private ArrayList<DaftarKelas> daftardaftarKelas;

    private Scanner scanner;

    
    public service(Scanner scanner) {

        this.daftarMember = new ArrayList<>();
        this.daftarInstruktur = new ArrayList<>();
        this.daftarJenisKelas = new ArrayList<>();
        this.daftardaftarKelas = new ArrayList<>();

        this.scanner = scanner;

        daftarMember.add(new Member(
                1, "Gita", "0852458335528", "Perempuan", "13 Agustus 2007"
        ));

        daftarInstruktur.add(new Instruktur(
                1, "Davi", "Laki-laki", "Mat Pilates", "085248335528", "Samarinda"
        ));

        daftarJenisKelas.add(new JenisKelas(
                1, "Mat Pilates", "Beginner", "60 Menit"
        ));

        daftarJenisKelas.add(new JenisKelasPrivate(
                2, "Reformer Pilates", "Intermediate", "60 Menit", "Couple Session"
        ));

        daftarJenisKelas.add(new JenisKelasPublik(
                3, "Mat Pilates", "Intermediate", "60 Menit", 15
        ));

        daftardaftarKelas.add(new DaftarKelas(
                1, 1, 1, 1, "13 September 2026",
                "16.30 WITA", "C402", "Terjadwal"
        ));
    }


    public void tambahMember() {

        int idMember;
        
        while (true) {

            idMember = InputValidator.inputInt(
                    scanner,
                    "ID Member: "
            );

        boolean idSudahAda = false;

        for (Member M : daftarMember) {

            if (M.getIdMember() == idMember) {
                idSudahAda = true;
                break;
            }
        }

        if (idSudahAda) {
            System.out.println(
                    ">> Masukkan ID baru yaa GeetsMates."
            );
        } else {
            break;
        }
    }

        String namaMember = InputValidator.inputText(
            scanner,
            "Nama: "
        );

        String noTelepon = InputValidator.inputNoTelepon(
            scanner,
            "No Telepon: "
        );

        String jenisKelamin = InputValidator.inputJenisKelamin(scanner);

        String tanggalLahir = InputValidator.inputText(
            scanner,
            "Tanggal Lahir: "
        );

        Member memberBaru = new Member(
            idMember,
            namaMember,
            noTelepon,
            jenisKelamin,
            tanggalLahir
        );

        daftarMember.add(memberBaru);

        System.out.println(
            ">> Selamat Bergabung, GeetsMates ^'^!"
        );
}

    public void lihatMember() {

        for (int i = 0; i < daftarMember.size(); i++) {

            Member M = daftarMember.get(i);

            System.out.println("ID Member: " + M.getIdMember());
            System.out.println("Nama Member: " + M.getNamaMember());
            System.out.println("No Telepon: " + M.getNoTelepon());
            System.out.println("Jenis Kelamin: " + M.getJenisKelamin());
            System.out.println("Tanggal Lahir: " + M.getTanggalLahir());
            System.out.println("--------------------------------");
        }
    }

    public void tambahInstruktur() {

        int idInstruktur;

        while (true) {

            idInstruktur = InputValidator.inputInt(
                    scanner,
                    "ID Instruktur: "
            );

            boolean idSudahAda = false;

            for (Instruktur I : daftarInstruktur) {

                if (I.getIdInstruktur() == idInstruktur) {
                    idSudahAda = true;
                    break;
            }
        }

        if (idSudahAda) {
            System.out.println(
                    ">> Masukkan ID baru yaa GeetsMates."
            );
        } else {
            break;
        }
    }

        String namaInstruktur = InputValidator.inputText(
            scanner,
            "Nama: "
        );

        String jenisKelamin = InputValidator.inputJenisKelamin(
            scanner
        );

        String spesialisasi = InputValidator.inputText(
            scanner,
            "Spesialisasi: "
        );

        String noTelepon = InputValidator.inputNoTelepon(
            scanner,
            "No Telepon: "
        );

        String domisili = InputValidator.inputText(
            scanner,
            "Domisili: "
        );

        Instruktur InstrukturBaru = new Instruktur(
                idInstruktur,
                namaInstruktur,
                jenisKelamin,
                spesialisasi,
                noTelepon,
                domisili
        );

        daftarInstruktur.add(InstrukturBaru);

        System.out.println(
                ">> Selamat Bergabung, Instruktur GeetsMates! ^'^"
        );
}


    public void lihatInstruktur() {

        for (int i = 0; i < daftarInstruktur.size(); i++) {

            Instruktur I = daftarInstruktur.get(i);

            System.out.println("ID Instruktur: " + I.getIdInstruktur());
            System.out.println("Nama Instruktur: " + I.getNamaInstruktur());
            System.out.println("Jenis Kelamin: " + I.getJenisKelamin());
            System.out.println("Spesialisasi: " + I.getSpesialisasi());
            System.out.println("No Telepon: " + I.getNoTelepon());
            System.out.println("Domisili: " + I.getDomisili());
            System.out.println("--------------------------------");
    }
}



    public void tambahJenisKelas() {

    int idJenis;

    while (true) {

        idJenis = InputValidator.inputInt(
                scanner,
                "ID Jenis: "
        );

        boolean idSudahAda = false;

        for (JenisKelas J : daftarJenisKelas) {

            if (J.getIdJenis() == idJenis) {
                idSudahAda = true;
                break;
            }
        }

        if (idSudahAda) {
            System.out.println(
                    ">> Masukkan ID baru yaa GeetsMates."
            );
        } else {
            break;
        }
    }

        String namaJenis = InputValidator.inputText(
            scanner,
            "Nama Pilates: "
        );

        String level = InputValidator.inputText(
            scanner,
            "Level: "
        );

        String durasi = InputValidator.inputText(
            scanner,
            "Durasi: "
        );
        
        System.out.println("\nPilih Jenis Kelas:");
        System.out.println("1. Kelas Publik");
        System.out.println("2. Kelas Private");

        int pilihan = InputValidator.inputPilihan(
            scanner,
            "Pilihan: ",
            1,2
        );

    JenisKelas jenisBaru;

    switch (pilihan) {

        case 1:

            int kapasitas = InputValidator.inputIntMinimal(
                    scanner,
                    "Kapasitas: ",
                    1
            );

            jenisBaru = new JenisKelasPublik(
                    idJenis,
                    namaJenis,
                    level,
                    durasi,
                    kapasitas
            );

            break;

        case 2:

            String jenisSesi = InputValidator.inputText(
                    scanner,
                    "Jenis Sesi: "
            );

            jenisBaru = new JenisKelasPrivate(
                    idJenis,
                    namaJenis,
                    level,
                    durasi,
                    jenisSesi
            );

            break;

        default:
            System.out.println("Pilihan tidak valid!");
            return;
    }

    daftarJenisKelas.add(jenisBaru);

    System.out.println(
            ">> Selamat Menikmati Jenis Kelas Baru, GeetsMates!"
    );
}



    public void lihatJenisKelas() {

        for (int i = 0; i < daftarJenisKelas.size(); i++) {

            JenisKelas J = daftarJenisKelas.get(i);

            System.out.println("ID Jenis: " + J.getIdJenis());
            System.out.println("Nama Jenis: " + J.getNamaJenis());
            System.out.println("Level: " + J.getLevel());
            System.out.println("Durasi: " + J.getDurasi());

            if (J instanceof JenisKelasPrivate) {
                System.out.println(
                        "Jenis Sesi: "
                        + ((JenisKelasPrivate) J).getJenisSesi()
                );
            }

            if (J instanceof JenisKelasPublik) {
                System.out.println(
                        "Kapasitas: "
                        + ((JenisKelasPublik) J).getKapasitas()
                );
            }

            System.out.println("--------------------------------");
        }
    }

    public void lihatPendaftarKelas() {

        for (int i = 0; i < daftardaftarKelas.size(); i++) {

            DaftarKelas K = daftardaftarKelas.get(i);

            String namaMember = "";
            String namaInstruktur = "";
            String namaJenis = "";

            for (Member M : daftarMember) {
                if (M.getIdMember() == K.getIdMember()) {
                    namaMember = M.getNamaMember();
                    break;
                }
            }

            for (Instruktur I : daftarInstruktur) {
                if (I.getIdInstruktur() == K.getIdInstruktur()) {
                    namaInstruktur = I.getNamaInstruktur();
                    break;
                }
            }

            for (JenisKelas J : daftarJenisKelas) {
                if (J.getIdJenis() == K.getIdJenis()) {
                    namaJenis = J.getNamaJenis();
                    break;
                }
            }

            System.out.println("ID Kelas       : " + K.getIdKelas());
            System.out.println("Nama Member    : " + namaMember);
            System.out.println("Nama Instruktur: " + namaInstruktur);
            System.out.println("Jenis Pilates  : " + namaJenis);
            System.out.println("Tanggal        : " + K.getTanggalKelas());
            System.out.println("Jam            : " + K.getJamKelas());
            System.out.println("Ruangan        : " + K.getRuangan());
            System.out.println("Status         : " + K.getStatus());
            System.out.println("--------------------------------");
        }
    }


    public void tambahKelas() {

        System.out.println("\n========================================");
        System.out.println("         Lihat Daftar GeetsMates        ");
        System.out.println("==========================================");

        lihatMember();

     int idMember = InputValidator.inputInt(
            scanner,
            "Pilih ID Member: "
        );

        Member memberDipilih = null;

        for (Member M : daftarMember) {
            if (M.getIdMember() == idMember) {
                memberDipilih = M;
                break;
        }
    }

    if (memberDipilih == null) {
        System.out.println(">> Daftarkan Member Dulu Yaa!");
        return;
    }

    System.out.println("\n========================================");
    System.out.println("       Lihat Jenis Kelas GeetsMates     ");
    System.out.println("==========================================");

    lihatJenisKelas();

    int idJenis = InputValidator.inputInt(
            scanner,
            "Pilih ID Jenis: "
    );

    JenisKelas jenisDipilih = null;

    for (JenisKelas J : daftarJenisKelas) {
        if (J.getIdJenis() == idJenis) {
            jenisDipilih = J;
            break;
        }
    }

    if (jenisDipilih == null) {
        System.out.println(">> Sorry, Jenis Kelas Belum Tersedia Yaa!");
        return;
    }

    System.out.println("\n========================================");
    System.out.println("       Lihat Instruktur GeetsMates      ");
    System.out.println("==========================================");

    lihatInstruktur();

    int idInstruktur = InputValidator.inputInt(
            scanner,
            "Pilih ID Instruktur: "
    );

    Instruktur instrukturDipilih = null;

    for (Instruktur I : daftarInstruktur) {
        if (I.getIdInstruktur() == idInstruktur) {
            instrukturDipilih = I;
            break;
        }
    }

    if (instrukturDipilih == null) {
        System.out.println(">> Instruktur tidak ditemukan!");
        return;
    }


    int idKelas;

    while (true) {

        idKelas = InputValidator.inputInt(
                scanner,
                "ID Kelas: "
        );

        boolean idSudahAda = false;

        for (DaftarKelas K : daftardaftarKelas) {

            if (K.getIdKelas() == idKelas) {
                idSudahAda = true;
                break;
            }
        }

        if (idSudahAda) {
            System.out.println(
                    ">> Masukkan ID baru yaa GeetsMates."
            );
        } else {
            break;
        }
    }

        String tanggalKelas = InputValidator.inputText(
            scanner,
            "Tanggal Kelas: "
        );

        String jamKelas = InputValidator.inputText(
            scanner,
            "Jam Kelas: "
        );

        String ruangan = InputValidator.inputText(
            scanner,
            "Ruangan: "
        );

        String status = InputValidator.inputStatusKelas(
            scanner
        );

        DaftarKelas kelasBaru = new DaftarKelas(
            idKelas,
            idMember,
            idInstruktur,
            idJenis,
            tanggalKelas,
            jamKelas,
            ruangan,
            status
        );

        daftardaftarKelas.add(kelasBaru);

        System.out.println("\n>> Selamat Mengikuti Kelas, GeetsMates!");
        System.out.println("Member     : " + memberDipilih.getNamaMember());
        System.out.println("Jenis      : " + jenisDipilih.getNamaJenis());
        System.out.println("Instruktur : " + instrukturDipilih.getNamaInstruktur());
        System.out.println("Tanggal    : " + tanggalKelas);
        System.out.println("Jam        : " + jamKelas);
        System.out.println("Ruangan    : " + ruangan);
        System.out.println("Status     : " + status);
}


    public void hapusDaftarKelas() {

        lihatPendaftarKelas();
        int idKelas = InputValidator.inputInt(
                scanner,
                "Masukkan ID Kelas: "
        );

        for (int i = 0; i < daftardaftarKelas.size(); i++) {

            if (daftardaftarKelas.get(i).getIdKelas() == idKelas) {

                daftardaftarKelas.remove(i);

                System.out.println(">> Sampai Ketemu Lagi, GeetsMates!");

                break;
            }
        }
    }

    public void updateKelas() {

        lihatPendaftarKelas();

        int idKelas = InputValidator.inputInt(
                scanner,
                "\nMasukkan ID Kelas: "
        );


        DaftarKelas kelasDipilih = null;

        for (DaftarKelas K : daftardaftarKelas) {

            if (K.getIdKelas() == idKelas) {
                kelasDipilih = K;
                break;
            }
        }

        if (kelasDipilih == null) {
            System.out.println(">> Maaf, ID Kelas tidak ada!");
            return;
        }

        System.out.println("\n>> ID Kelas ditemukan!");
        System.out.println("ID Kelas : " + kelasDipilih.getIdKelas());
        System.out.println("Status Saat Ini : " + kelasDipilih.getStatus());

        String status = InputValidator.inputStatusKelas(scanner);


        kelasDipilih.setStatus(status);

        System.out.println(">> Status Kelas Berhasil Diperbarui!");
    }
}

