package com.yuda.BelajarJava.collection;

import java.util.*;   // import library

public class map {

    public static void main(String[] args) {
        Map<Integer, String> noabsen = new HashMap<>(); // penggunaan HashMap

        noabsen.put(45, "Raisa");  // menambahkan objek ke dalam collection
        noabsen.put(46, "Riki");
        noabsen.put(47, "Antony");
        noabsen.put(48, "Diwa");
        noabsen.put(49, "Vano");
        noabsen.put(50, "Ahmad");

        System.out.println("Jumlah Murid Awal : " +noabsen.size()+ " Orang"); // menampilkan jumlah collection
        for(Integer no : noabsen.keySet()) {                                            // perulangan untuk menampilkan isi collection
            System.out.println("No Absen " +no + "\n\tDengan nama :" +noabsen.get(no));
        }

        noabsen.remove(45);    // menghapus objek pada collection dengan key
        noabsen.remove(47);
        noabsen.replace(50,"Agung"); // mengganti isi objek

        System.out.println("\nJumlah Murid Akhir : " +noabsen.size()+ " Orang");
        for(Integer no : noabsen.keySet()) {
            System.out.println("No Absen " +no + "\n\tDengan nama :" +noabsen.get(no));
        }
    }
}
