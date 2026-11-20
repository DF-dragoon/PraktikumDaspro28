// PARAMETER UNIK ELEMENT = 28, 36, -1, 33
// HASIL MODOFOKASI ELEMET

import java.util.Arrays;

public class ArrayBilangan28modifikasi {
    public static void main (String[]args){

        int[]bil = {28, 36, -1, 33};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Bil [" + i + "] =" + bil [i] + ", double =" +bil[i]*2);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
