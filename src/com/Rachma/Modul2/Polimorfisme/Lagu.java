package com.Rachma.Modul2.Polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    //Overloading
    public Lagu(String judul) {
        this.judul = judul;
        this.pencipta = "Tidak diketahui";
    }

    //Overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
    }
}
