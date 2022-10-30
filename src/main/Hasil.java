package main;

public class Hasil {

    private int panjang;
    private int lebar;
    private int tinggi;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }


    protected long Hasil(){
        Perhitungan p = new Perhitungan();
        System.out.println("Hasil Luas Balok   : "+ p.luas(this));
        System.out.println("Hasil Volume balok : " + p.volume(this));
        return 0;
    }

}
