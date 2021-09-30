import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.print("Massivin olcusunu daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int olcu = scanner.nextInt();
        int[] massiv = Massiv.massivYarat(olcu);
        Massiv.massiviGoster(massiv);

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 0) {
                for (int j = i; j < massiv.length; j++) {


                }
            }
        }
    }
}
