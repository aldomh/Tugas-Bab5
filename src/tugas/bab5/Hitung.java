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
    
    public void penyederhanaan(int a, int b){
        int temp, nilai1, nilai2;
        if (b == 0) {
            return;
        }
        nilai1 = (a < b) ? b : a;
        nilai2 = (a < b) ? a : b;

        while (nilai2 != 0) {
            temp = nilai1 % nilai2;
            nilai1 = nilai2;
            nilai2 = temp;
        }
        a /= nilai1;
        b /= nilai1;
        System.out.println("Hasil Penyederhanaan = " + a + "/" + b);
    }
}