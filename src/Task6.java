import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.print("Massivin olcusunu daxil edin: ");
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] massiv = Massiv.massivYarat(n);
        Massiv.massiviGoster(massiv);

        System.out.print("Cemi beraber olmaq istediyin ededi daxil edin: ");
        int k = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = i; j < massiv.length; j++) {
                if (massiv[i] + massiv[j] == k) {
                    System.out.println(massiv[i] + " ve " + massiv[j]);
                    counter++;
                }
            }
        }

        if (counter == 0) {
            System.out.println("Cemi " + k + " ededine beraber olan cutluk bu massivde yoxdur");
        }

        scanner.close();
    }
}
