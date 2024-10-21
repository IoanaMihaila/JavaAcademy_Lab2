/*Construiți un program ce identifică toți "liderii" dintr-un tablou de numere întregi.
Un element din tablou este "lider" dacă este mai mare decât toate elementele din dreapta sa.
*/
public class Problema2 {
    static void lider(int[] tablou) {
        int maxDreapta = tablou[tablou.length - 1];
        System.out.println(maxDreapta);
        for (int i = tablou.length - 2; i >= 0; i--) {
            if (tablou[i] > maxDreapta) {
                maxDreapta = tablou[i];
                System.out.println(" " + maxDreapta);
            }
        }
    }

    public static void main(String[] args) {
        int[] tablou = {10, 21, 5, 14, 7, 4, 11};
        System.out.println("Liderii sunt: ");
        lider(tablou);
    }
}
