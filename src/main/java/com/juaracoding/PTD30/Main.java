package com.juaracoding.PTD30;

public class Main {
    public static void main(String[] args) {


        System.out.println("Cetak Angka 1 - 100");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 3 == 0)
                System.out.println("BIZZ : " + i);

            if (i % 5 == 0)
                System.out.println("BUZZ : " + i);

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("BIZZBUZZ : " + i);
        }

        }
    }