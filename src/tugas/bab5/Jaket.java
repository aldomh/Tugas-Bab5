package prakproglan;
public class Jaket {
    
    public String jaket[] = {"Jaket A", "Jaket B", "Jaket C"};
    public final int hargaJaket[] = {100000, 125000, 175000};
    public int diskon[] = {5000, 5000, 15000};
    public int harga[] = new int[3];
    public int jumlah[];
    public int total;
    
    public void hargaJaket(){
        System.out.println("Daftar Harga Jaket");
        System.out.println("Nama\t Harga Satuan");
        for (int i = 0; i < 3; i++) {
            System.out.println(jaket[i] + "\t Rp " + hargaJaket[i]);
        }
        System.out.println("Pesan lebih dari 100 dapat diskon");
        System.out.println("Jaket A : Rp  95.000/biji");
        System.out.println("Jaket B : Rp 120.000/biji");
        System.out.println("Jaket C : Rp 160.000/biji");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
    
    public void pesanJaket(int a[]) {
        jumlah = a;
        total = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > 100) {
                harga[i] = (hargaJaket[i] * a[i]) - (diskon[i] * a[i]);
            } else {
                harga[i] = (hargaJaket[i] * a[i]);
            }
            total += harga[i];
        }
    }
}