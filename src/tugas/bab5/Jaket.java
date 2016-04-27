package prakproglan;
public class Jaket {
    
    public String jaket[] = {"Jaket A", "Jaket B", "Jaket C"};
    public final int hargaJaket[] = {100000, 125000, 175000};
    public int diskon[] = {5000, 5000, 15000};
    public int harga[] = new int[3];
    public int jumlah[];
    public int total;
    
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