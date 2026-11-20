import java.util.Scanner;
public class SearchNilai28 {
    public static void main (String[]args){
        Scanner doni = new Scanner (System.in);

        System.out.println("MASUKKAN BANYAKNYA ELEMEN ");
        int banyak=doni.nextInt();
        int[] nilai = new int [banyak];
        int key = 78;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("MASUKKAN ELEMEN ke-" +(i+1) +" :");
            nilai[i]=doni.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key){
                System.out.println("NILAI 0" +key+ " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break ;
            }
        }
        if (!ditemukan) {
            System.out.println("NILAI " +key+ " TIDAK DITEMUKAN DIALAM ELEMENT ARRAY TERSEBUT.");
        }
    }
}