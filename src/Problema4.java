/*Inițial, se definește un tablou de numere întregi, mai mari ca 0, de 5
elemente. Ulterior, se va construi o metodă prin care se poate adaugă un număr
primit ca parametru la finalul unui tablou primit, de asemenea, ca parametru.
Se va returna noul tablou cu numărul adăugat la final, însă trebuie să acoperiți și cazul
 în care nu mai pot exista locuri în tablou.
 */

import java.util.Arrays;

public class Problema4 {
    static int[] adaugare(int[] tablou, int valoare){
        int n=tablou.length;
        int count=0;
        for(int i=0;i<tablou.length;i++){
            if(tablou[i]==0){
                count++;
            }
        }
        n=tablou.length-count;
        if(n<tablou.length){
            tablou [n]=valoare;
            return tablou;
        }
        else{
            int[] nouTablou=new int[tablou.length+1];
            for(int i=0;i<tablou.length;i++){
                nouTablou[i]=tablou[i];
            }
            nouTablou[nouTablou.length-1]=valoare;
            return nouTablou;
        }
    }

    public static void main(String[] args) {
        int[] tablou= new int[5];
        tablou[0] = 1;
        tablou[1] = 2;
        tablou[2] = 3;
        tablou[3] = 4;
        System.out.println("Tabloul initial: "+Arrays.toString(tablou));
        System.out.println("Tabloul dupa prima adaugare: "+ Arrays.toString(adaugare(tablou,6)));
        System.out.println("Tabloul dupa a doua adaugare: "+Arrays.toString(adaugare(tablou,10)));
    }
}
