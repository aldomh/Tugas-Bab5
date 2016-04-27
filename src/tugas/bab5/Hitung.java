package prakproglan;
public class Hitung {
    
    public static void penjumlahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan "+a+" + "+b+" = "+hasil);
    }
    
    public static void pengurangan(int a, int b){
        int hasil = a - b;
        System.out.println("Hasil Pengurangan "+a+" - "+b+" = "+hasil);
    }
    
    public void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil Perkalian "+a+" x "+b+" = "+hasil);
    }
    
    public void pembagian(int a, int b){
        double hasil = a / b;
        System.out.println("Hasil Pembagian "+a+" : "+b+" = "+hasil);
    }
    
}