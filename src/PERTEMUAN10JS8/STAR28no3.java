// PARAMETER UNIK
// pertanyaan 3 = n =14
import java.util.Scanner;
public class STAR28no3 {
    public static void main(String[]args){
        Scanner sc = new  Scanner (System.in);
        System.out.print("MASUKKAN NILAI n=");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i+=1 ) { 
            System.out.print(i +"");
        }
        System.out.println();
        sc.close();
    }
}
