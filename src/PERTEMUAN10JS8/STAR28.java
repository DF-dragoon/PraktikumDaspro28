// PARAMETER UNIK
// step  no 10 : n = 6 dan n = 12
// pertanyaan 1 dan 2 : n = 4
import java.util.Scanner;
public class STAR28 {
    public static void main(String[]args){
        Scanner sc = new  Scanner (System.in);
        System.out.print("MASUKKAN NILAI n=");
        int n = sc.nextInt();

        for (int i = 0; i <=n ; i--) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
// jika n = 6 maka akan menghasilkan 6 bintang
// jika n = 12 maka akan menghasilkan 12 bintang