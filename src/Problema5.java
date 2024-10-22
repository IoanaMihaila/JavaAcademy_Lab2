import java.util.Arrays;

/*Construiți un program care, pentru un tablou de numere întregi,
va implementa funcționalitatea de a roti la dreapta toate elementele cu k poziții.
De exemplu: T=[1,2,3,4], k=2 => T=[3,4,1,2]*/
public class Problema5 {

    public static void inversare(int[] tablou, int start, int end) {
        while (start < end) {
            int temp = tablou[start];
            tablou[start] = tablou[end];
            tablou[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotireDreapta(int[] tablou, int k) {
        int n = tablou.length;
        k = k % n;//daca k e mai mare decat lungimea tabloului, luam k%n

        //Pasul 1:Inversam tot tabloul
        inversare(tablou, 0, n - 1);
        //Pasul2:Inversam primele k elemente
        inversare(tablou, 0, k - 1);
        //Pasul 3:Inversam ultimele n-k elemente
        inversare(tablou, k, n - 1);
    }

    public static void main(String[] args) {
        int[] tablou = {1, 2, 3, 4};
        int k = 2;
        System.out.println("Tabloul initial: " + Arrays.toString(tablou));
        rotireDreapta(tablou, k);
        System.out.println("Tabloul dupa rotire cu " + k + " pozitii: " + Arrays.toString(tablou));
    }
}
