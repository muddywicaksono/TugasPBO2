package Datadiri;

import java.util.Scanner;

public class Username {
    String username;
    public void akun(){
        Scanner akun = new Scanner(System.in);
        System.out.println("    Buat Akun Anda");
        System.out.print("    username : ");
        this.username = akun.next();
    }
}
