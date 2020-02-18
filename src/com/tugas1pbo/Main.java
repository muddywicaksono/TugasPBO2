package com.tugas1pbo;

import java.util.Scanner;
import Datadiri.*;

public class Main {

    public static void main(String[] args) {
        char ulang,akun;
        System.out.println("    Tugas PBO 2");
        Username peminjam = new Username();
        Pribadi data = new Pribadi();
        Transaksi cicilan = new Transaksi();

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("    Selamat Datang di Selamat Datang");
            System.out.println("    Solusi untuk Anda di Akhir Bulan");

            System.out.println("  Menu Selamat Datang: ");
            System.out.println("  1. Pinjaman ");
            System.out.println("  2. Exit");

            System.out.print("     Pilih Menu : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("    Masukkan Nominal Pinjaman Anda : Rp.");
                    double pinjaman = input.nextInt();
                    System.out.print("    Lama Cicilan (Dalam Bulan) : ");
                    double lama = input.nextInt();
                    System.out.print("    Cicilan Bulanan : Rp." + cicilan.cicil(pinjaman,lama) );

                    peminjam.akun();
                    data.datapribadi();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
            System.out.print("  Ingin Bertransaksi Lagi (y/n) ? ");
            ulang = input.next().charAt(0);
        }while (ulang == 'y');
    }
}
