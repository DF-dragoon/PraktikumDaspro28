// PARAMETER UNIK
// untuk step ke-9 : (baris =3 ; kolom = 5) dan (baris = 6 ; kolom = 4)
// untuk pertanyaan 2 : baris = 4 ; kolom = 6
import java.util.Scanner;
public class Rectangle28 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah baris :");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom :");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
