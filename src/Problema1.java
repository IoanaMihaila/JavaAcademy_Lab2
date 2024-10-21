/*Construiti un program responsabil de a identifica indexul de echilibru dintr-un
 * tablou de numere intregi. Un index de echilibru este acel index dintr-o secventa de numere
 * astfel incat suma numerelor cu indecsii mai mici este egala cu suma numerelor cu indecsi
 * mai mari*/

public class Problema1 {

    static int indexEchilibru(int[] tablou) {
        int sumaTotala = 0;
        for (int i = 0; i < tablou.length; i++) {
            sumaTotala = sumaTotala + tablou[i];
        }

        int sumaStanga = 0;

        for (int i = 0; i < tablou.length; i++) {
            sumaTotala = sumaTotala - tablou[i];

            if (sumaStanga == sumaTotala) {
                return i;
            }
            sumaStanga = sumaStanga + tablou[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tablou = {-7, 1, 5, 2, -4, 3, 0};
        int index = indexEchilibru(tablou);
        if (index != -1) {
            System.out.println("S-a gasit indexul de echilibru = " + index);
        } else {
            System.out.println("NU s-a gasit indexul de echilibru");
        }
    }
}
