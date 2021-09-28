import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin olcusunu daxil edin: ");
        int olcu = scanner.nextInt();
        int[] massiv = new int[olcu];

        System.out.print("Massivin elementleri: ");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (100 * Math.random());
            System.out.print(massiv[i] + " ");
        }

        System.out.print("\nAxtarilan reqemi daxil edin: ");
        int eded = scanner.nextInt();
        int say = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (eded == massiv[i]) {
                say++;
            }
        }

        if (say != 0) {
            System.out.printf("Axtarilan ededden %d qeder tapildi", say);
        } else {
            System.out.println("Axtarilan eded massivde movcud deyil");
        }
    }
}
