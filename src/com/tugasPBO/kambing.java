//latihan 4 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-1
// Deskripsi  : mengakses kelas dan method lalu menampilkan ke layar
package com.tugasPBO;

public class kambing {
    public static void tambahKambing() {
        int jumlahKambing = 0;
        jumlahKambing += 5;
        System.out.println("Jumlah kambing setelah ditambahkan : " + jumlahKambing);
    }

    public static void main(String[] args) {
        kambing kambingjantan = new kambing();
        kambingjantan.tambahKambing();

    }
}
