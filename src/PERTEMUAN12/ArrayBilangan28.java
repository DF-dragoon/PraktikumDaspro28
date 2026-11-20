// PARAMETER UNIK ELEMENT = 28, 36, -1, 33

import java.util.Arrays;
public class ArrayBilangan28 {
    public static void main (String[]args){

        int[]bil = new int [4];
        bil[0]= 28 ;
        bil[2]= 36;
        bil[3]= -1;
        bil[4]= 33;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Bil [" + i + "] =" + bil [i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
