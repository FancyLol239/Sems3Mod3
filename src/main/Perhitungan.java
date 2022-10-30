package main;

public class Perhitungan {

    static long luas,volume;

    void perhitungan(){
        Hasil sisi = new Hasil();
        luas(sisi);
        volume(sisi);
    }

    public static long volume(Hasil sisi) {
       return volume = 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public static long luas(Hasil sisi) {
        return luas =  sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    
    static boolean isCube(long input){
        long cube = Math.round(Math.cbrt(input));
//      System.out.print(cube * cube * cube);
        return cube != 0;
    }


//    static boolean isCube(long input){
//        return (Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) == input);
//    }
}
