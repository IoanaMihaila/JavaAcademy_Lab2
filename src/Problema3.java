/*Construiți un program care, dintr-un tablou de numere întregi cu elemente
 mai mari decât 0, va șterge din tablou un număr identificat după:
a. index
b. valoare(prima aparitie)
*/

import java.util.Arrays;

public class Problema3 {
    static int[] stergeIndex(int[] tablou, int index){
        for(int i=index;i< tablou.length-1;i++){
            tablou[i]=tablou[i+1];
        }
        tablou[tablou.length - 1] = 0;
        return tablou;
    }

    static int[] stergeValoare(int[] tablou, int valoare){
        int index = -1;
        for(int i=0;i< tablou.length;i++){
            if(tablou[i]==valoare){
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Valoarea " + valoare + " nu a fost găsită în tablou.");
            return tablou;
        }
        return stergeIndex(tablou, index);
    }

    public static void main(String[] args) {
        int[] tablou={5,7,8,10,33,100};
        System.out.println(Arrays.toString(stergeIndex(tablou,3)));
        System.out.println(Arrays.toString(stergeValoare(tablou,7)));

        int count = 0;
        for (int val : tablou) {
            if (val != 0) {
                count++;
            }
        }
        int[] tablouCurat = new int[count];
        int j = 0;
        for (int val : tablou) {
            if (val != 0) {
                tablouCurat[j++] = val; // Adăugăm valorile diferite de 0
            }
        }
        System.out.println("Tablou curățat de zero-uri: " + Arrays.toString(tablouCurat));

    }
}
