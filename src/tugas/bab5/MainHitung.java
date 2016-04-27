package prakproglan;

import java.util.Scanner;

public class MainHitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hitung hitung = new Hitung();
        
        System.out.println("Penjumlahan");
        System.out.print("Masukkan nilai 1 : ");
        int a1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b1 = in.nextInt();
        Hitung.penjumlahan(a1, b1);
        
        System.out.println("\nPengurangan");
        System.out.print("Masukkan nilai 1 : ");
        int a2 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b2 = in.nextInt();
        Hitung.pengurangan(a2, b2);
        
        System.out.println("\nPerkalian");
        System.out.print("Masukkan nilai 1 : ");
        int a3 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b3 = in.nextInt();
        hitung.perkalian(a3, b3);
        
        System.out.println("\nPembagian");
        System.out.print("Masukkan nilai 1 : ");
        int a4 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b4 = in.nextInt();
        hitung.pembagian(a4, b4);
        
        System.out.println("\nPenyederhanaan");
        System.out.print("Masukkan nilai 1 : ");
        int a5 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b5 = in.nextInt();
        hitung.penyederhanaan(a5, b5);
    }
}
