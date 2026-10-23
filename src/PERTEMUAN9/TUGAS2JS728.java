// PARAMETER UNIK
// TARIF PARKIR MOBIL (JENIS 1)=Rp3500 perjam
// TARIF PARKIR MOTOR (JENIS 2)=Rp2500 perjam

import java.util.Scanner;
public class TUGAS2JS728 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int jenis=1, durasi=0, total = 0;

        do {
            System.out.println("MASUKKAN JENIS KENDAARAN ANDA (1=MOBIL ; 2=MOTOR ; 0=KELUAR): ");
           jenis=sc.nextInt();
           if (jenis == 0 && jenis >=3 ) {
            break;
           }
            if (jenis == 1 || jenis == 2) {
                System.out.println("MASUKKAN DURASI LAMA PARKIR");
                durasi = sc.nextInt();  
                if (jenis == 1) {
                    total = durasi*3500;
                    System.out.println("TOTAL PEMBAYARAN ANDA BAYAR:" +total);
                } else {
                    total = durasi*2500;
                    System.out.println("TOTAL PEMBAYARAN ANDA BAYAR:" +total);
                }
            } 
        } while (jenis!=0);
        System.out.println("SELESAI");
    }
}
