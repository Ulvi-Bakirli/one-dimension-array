public class Massiv {

    public static int[] massivYarat(int olcu) {
        int [] massiv = new int[olcu];
        for (int i = 0; i < olcu; i++) {
            massiv[i] = (int) (100 * Math.random());
        }
        return massiv;
    }

    public static void massiviGoster(int[] massiv) {
        System.out.println("Massivin elementleri:");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.print("\n");
    }
}
