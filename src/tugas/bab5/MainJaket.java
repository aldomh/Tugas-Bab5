package prakproglan;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket jaket = new Jaket();
        int a[] = new int[3];
        System.out.println("~~~~~~~~~~~~CV.Labkomdas~~~~~~~~~~");
        jaket.hargaJaket();
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Jumlah " + jaket.jaket[i] + " : ");
            a[i] = in.nextInt();
        }
        jaket.pesanJaket(a);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        jaket.showHarga();
    }
}