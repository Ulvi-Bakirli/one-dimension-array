import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin olcusu daxil edin: ");
        int olcu = scanner.nextInt();
        int[] massiv = Massiv.massivYarat(olcu);

        Massiv.massiviGoster(massiv);

        System.out.println("Silmek istediyiniz elementi daxil edin: ");
        int element = scanner.nextInt();

        for (int i = 0; i < olcu; i++) {
            if (element == massiv[i]) {

                for (int j = i; j < olcu; j++) {

                    if (j == (olcu - 1)) {
                        massiv[j] = 0;
                    } else {
                        massiv[j] = massiv[j + 1];
                    }
                }
                //eger buradaki break silsek, o zaman massivde olan butun axtarilan elementler silinecek
                break;
            }
        }
        Massiv.massiviGoster(massiv);
        scanner.close();
    }
}
