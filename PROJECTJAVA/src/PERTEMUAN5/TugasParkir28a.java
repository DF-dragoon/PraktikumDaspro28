package PROJECTJAVA.src.PERTEMUAN5;
import java.util.Scanner;
public class TugasParkir28a {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    int lamaParkir;
    int totalBayar;
    int tarifDasar = 2000;
    int hargaLebih2Jam=1000;

    System.out.println("MASUKKAN LAMA PARKIR (JAM): ");
    lamaParkir = sc.nextInt();

    if (lamaParkir <= 2) {
        System.out.println("PEMBAYARAN ANDA ADALAH 2000");
    } else { 
        totalBayar = tarifDasar + hargaLebih2Jam*(lamaParkir - 2);
        System.out.println("TOTAL BAYAR ANDA ADALAH = " + totalBayar);  
    }
  }
    
}
