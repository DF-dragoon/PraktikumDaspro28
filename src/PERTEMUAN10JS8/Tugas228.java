import java.util.Scanner;
public class Tugas228 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai N :");
        int n = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }
        System.out.println(" jumlah seluruh angka :" + jumlah);
        sc.close();
    }
    
}
