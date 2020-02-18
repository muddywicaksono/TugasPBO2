package Datadiri;

import java.util.Scanner;

public class Pribadi {
    String nama,tempat,ibu;
    int tanggal,nik;
    public void datapribadi(){
        Scanner data = new Scanner(System.in);
        System.out.println("    Isi Data Diri Anda");
        System.out.print("    Nama : ");
        this.nama = data.next();
        System.out.print("    Nik: ");
        this.nik = data.nextInt();
        System.out.print("    Tanggal Lahir : ");
        this.tanggal = data.nextInt();
        System.out.print("    Tempat Lahir : ");
        this.tempat = data.next();
        System.out.print("    Nama Ibu Kandung : ");
        this.ibu = data.next();
    }
}
