
package main;

import java.util.Scanner;
import service.service;
import service.InputValidator;

public class SistemPilates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        service service = new service(scanner);

        int pilihan;

        do {
            System.out.println("\n==========================================");
            System.out.println("     Welcome to Geets Pilates Studio ^'^");
            System.out.println("============================================");
            System.out.println("1. Member");
            System.out.println("2. Instruktur");
            System.out.println("3. Jenis Kelas");
            System.out.println("4. Daftar Kelas");
            System.out.println("5. Keluar");
            System.out.println("============================================");

            pilihan = InputValidator.inputPilihan(
                    scanner,
                    "Pilih menu: ",
                    1,
                    5
            );

            switch (pilihan) {

                case 1:
                    menuMember(scanner, service);
                    break;

                case 2:
                    menuInstruktur(scanner, service);
                    break;

                case 3:
                    menuJenisKelas(scanner, service);
                    break;

                case 4:
                    menuDaftarKelas(scanner, service);
                    break;

                case 5:
                    System.out.println(
                            "\n>> See You Again, GeetsMates ^'^!"
                    );
                    break;
            }

        } while (pilihan != 5);

        scanner.close();
    }



    public static void menuMember(
            Scanner scanner,
            service service) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("      Member Geets Pilates Studio       ");
            System.out.println("========================================");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Member");
            System.out.println("3. Kembali");
            System.out.println("========================================");

            pilihan = InputValidator.inputPilihan(
                    scanner,
                    "Pilih menu: ",
                    1,
                    3
            );

            switch (pilihan) {

                case 1:
                    System.out.println("\n========================================");
                    System.out.println("       Tambahkan GeetsMates             ");
                    System.out.println("========================================");
                    service.tambahMember();
                    break;

                case 2:
                    System.out.println("\n========================================");
                    System.out.println("       Lihat Daftar GeetsMates          ");
                    System.out.println("========================================");
                    service.lihatMember();
                    break;

                case 3:
                    break;
            }

        } while (pilihan != 3);
    }



    public static void menuInstruktur(
            Scanner scanner,
            service service) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("     Instruktur Geets Pilates Studio    ");
            System.out.println("========================================");
            System.out.println("1. Tambah Instruktur");
            System.out.println("2. Lihat Instruktur");
            System.out.println("3. Kembali");
            System.out.println("========================================");

            pilihan = InputValidator.inputPilihan(
                    scanner,
                    "Pilih menu: ",
                    1,
                    3
            );

            switch (pilihan) {

                case 1:
                    System.out.println("\n========================================");
                    System.out.println("      Tambahkan Instruktur GeetsMates   ");
                    System.out.println("========================================");
                    service.tambahInstruktur();
                    break;

                case 2:
                    System.out.println("\n========================================");
                    System.out.println("       Lihat Instruktur GeetsMates      ");
                    System.out.println("========================================");
                    service.lihatInstruktur();
                    break;

                case 3:
                    break;
            }

        } while (pilihan != 3);
    }



    public static void menuJenisKelas(
            Scanner scanner,
            service service) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("     Jenis Kelas Geets Pilates Studio   ");
            System.out.println("========================================");
            System.out.println("1. Tambah Jenis Kelas");
            System.out.println("2. Lihat Jenis Kelas");
            System.out.println("3. Kembali");
            System.out.println("========================================");

            pilihan = InputValidator.inputPilihan(
                    scanner,
                    "Pilih menu: ",
                    1,
                    3
            );

            switch (pilihan) {

                case 1:
                    System.out.println("\n========================================");
                    System.out.println("      Tambahkan Jenis Kelas GeetsMates  ");
                    System.out.println("========================================");
                    service.tambahJenisKelas();
                    break;

                case 2:
                    System.out.println("\n========================================");
                    System.out.println("      Lihat Jenis Kelas GeetsMates      ");
                    System.out.println("========================================");
                    service.lihatJenisKelas();
                    break;

                case 3:
                    break;
            }

        } while (pilihan != 3);
    }



    public static void menuDaftarKelas(
            Scanner scanner,
            service service) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("     Daftar Kelas Geets Pilates Studio  ");
            System.out.println("========================================");
            System.out.println("1. Lihat Daftar Kelas");
            System.out.println("2. Pendaftaran Kelas");
            System.out.println("3. Hapus Kelas");
            System.out.println("4. Update Status Kelas");
            System.out.println("5. Kembali");
            System.out.println("========================================");

            pilihan = InputValidator.inputPilihan(
                    scanner,
                    "Pilih menu: ",
                    1,
                    5
            );

            switch (pilihan) {

                case 1:
                    System.out.println("\n========================================");
                    System.out.println("      Lihat Daftar Kelas GeetsMates     ");
                    System.out.println("========================================");
                    service.lihatPendaftarKelas();
                    break;

                case 2:
                    System.out.println("\n========================================");
                    System.out.println("       Daftar Kelas GeetsMates          ");
                    System.out.println("========================================");
                    service.tambahKelas();
                    break;

                case 3:
                    System.out.println("\n========================================");
                    System.out.println("        Hapus Kelas GeetsMates          ");
                    System.out.println("========================================");
                    service.hapusDaftarKelas();
                    break;

                case 4:
                    System.out.println("\n========================================");
                    System.out.println("       Update Status Kelas              ");
                    System.out.println("========================================");
                    service.updateKelas();
                    break;

                case 5:
                    break;
            }

        } while (pilihan != 5);
    }
}

