import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin olcusunu daxil edin: ");
        int olcu = scanner.nextInt();

        int[] massiv = Massiv.massivYarat(olcu);
        Massiv.massiviGoster(massiv);

        System.out.print("Silmek istediyiniz indeksi daxil edin: ");
        int index = scanner.nextInt();

        if (index > olcu || index < 0) {
            System.out.println("Indeks massivin olcusunden boyuk ve ya menfi eded olmamalidir");
        } else {
            for (int i = index; i < olcu; i++) {
                if (i == (olcu - 1)) {
                    massiv[i] = 0;
                } else {
                    massiv[i] = massiv[i + 1];
                }
            }
            Massiv.massiviGoster(massiv);
        }
        scanner.close();
    }
}
