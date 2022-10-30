package main;

public class Perhitungan extends Hitung{

    static long luas,volume;

    void perhitungan(){
        Perhitungan sisi = new Perhitungan();
        luas(sisi);
        volume(sisi);
    }

    public static long volume(Hitung sisi) {
       return volume = 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public static int luas(Hitung sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }


    static boolean isCube(long input){
        long cube = Math.round(Math.cbrt(input));
//      System.out.print(cube * cube * cube);
        return cube == cube;
    }
}
