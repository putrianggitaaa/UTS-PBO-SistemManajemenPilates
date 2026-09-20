
package service;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidator {

    
    public static int inputInt(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);

            try {
                int angka = scanner.nextInt();
                scanner.nextLine();
                return angka;
            } catch (InputMismatchException e) {
                System.out.println(">> Masukkan angka dengan benar, GeetsMates!");
                scanner.nextLine();
            }
        }
    }

    
    public static int inputIntMinimal(
            Scanner scanner,
            String pesan,
            int minimal) {

        while (true) {
            int angka = inputInt(scanner, pesan);

            if (angka >= minimal) {
                return angka;
            }

            System.out.println(
                ">> Nilai minimal adalah " + minimal + "!"
            );
        }
    }

    
    public static String inputText(
            Scanner scanner,
            String pesan) {

        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(">> Input tidak boleh kosong yaa!");
        }
    }

    
    public static String inputNoTelepon(
            Scanner scanner,
            String pesan) {

        while (true) {
            System.out.print(pesan);
            String noTelepon = scanner.nextLine();

            if (!noTelepon.isEmpty()) {
                return noTelepon;
            }

            System.out.println(">> Harap isi nomor telepon yaa!");
        }
    }

    
    public static int inputPilihan(
            Scanner scanner,
            String pesan,
            int minimal,
            int maksimal) {

        while (true) {
            int pilihan = inputInt(scanner, pesan);

            if (pilihan >= minimal && pilihan <= maksimal) {
                return pilihan;
            }

            System.out.println(
                ">> Pilihan angka di antara "
                + minimal + " - " + maksimal + "!"
            );
        }
    }

    
    public static String inputJenisKelamin(Scanner scanner) {

        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");

        int pilihan = inputPilihan(
            scanner,
            "Pilih Jenis Kelamin: ",
            1,
            2
        );

        if (pilihan == 1) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

    
    public static String inputStatusKelas(Scanner scanner) {

        System.out.println("\nPilih Status Kelas:");
        System.out.println("1. Terjadwal");
        System.out.println("2. Selesai");
        System.out.println("3. Batal");

        int pilihan = inputPilihan(
            scanner,
            "Pilihan: ",
            1,
            3
        );

        switch (pilihan) {
            case 1:
                return "Terjadwal";
            case 2:
                return "Selesai";
            case 3:
                return "Batal";
            default:
                return "";
        }
    }
}
