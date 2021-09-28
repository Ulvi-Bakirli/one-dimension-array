import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int bulka = 1;
        float sud = 0.9f;

        System.out.print("Sinifdeki usaq sayini daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int usaqSayi = scanner.nextInt();
        int[] sinif = new int[usaqSayi];

        System.out.print("\nSinifdeki usaqlarin cekisini daxil edin: ");
        for (int i = 0; i < sinif.length; i++) {
            sinif[i] = scanner.nextInt();
        }

        int bulkaSay = 0;
        float sudSay = 0.0f;
        for (int i = 0; i < sinif.length; i++) {
            if (sinif[i] < 30) {
                bulkaSay++;
                sudSay += 0.2f;
            }
        }
        System.out.printf("Usaqlara %d sayda bulka ve %d qutu sud lazimdir", bulkaSay, (int) ((sudSay / sud) + 1));
    }
}
