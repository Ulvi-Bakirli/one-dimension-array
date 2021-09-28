public class Task5 {
    public static void main(String[] args) {

        int[] massiv = Massiv.massivYarat(20);
        Massiv.massiviGoster(massiv);

        int max = massiv[0];
        int max2 = 0;
        int index = 0;
        int index2 = 0;

        for (int i = 1; i < 20; i++) {
            if (max < massiv[i]) {
                max2 = max;
                index2 = index;
                max = massiv[i];
                index = i;
            } else if (max > massiv[i] && max2 < massiv[i]) {
                //eger else-if blokunda max>massiv[i] hissesinde = isaresi qoyulsa, bir reqemin hem max, hem de max2 olma ehtimali olur.
                //Eger dublikat istemirikse, = isaresi qoymuruq. Eger ferqi yoxdursa, = isaresi qoyulur.
                max2 = massiv[i];
                index2 = i;
            }
        }
        System.out.printf("En boyuk ikinci eded %d, indeksi ise %d.", max2, index2);
    }
}
