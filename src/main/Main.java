package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hasil h = new Hasil();
        Perhitungan p = new Perhitungan();


        System.out.print("Masukkan Panjang Balok : ");
        h.setPanjang(s.nextInt());
        System.out.print("Masukkan Lebar Balok   : ");
        h.setLebar(s.nextInt());
        System.out.print("Masukkan Tinggi Balok  : ");
        h.setTinggi(s.nextInt());
        System.out.println("");
        h.Hasil();
        System.out.print("Balok " + p.isCube(p.luas(h)));
    }

}
