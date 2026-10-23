// PARAMETER UNIK
// HARGA TIKET = 48000
// DISKON PERTAMA = >4, DISKON = 11%
// DISKON KEDUA = >8, DISKON 15%
import java.util.Scanner;
public class TUGAS1JS728 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int hargaTiket = 50000, jumlah, i=0, tiket, totalTiket=0;
        double hargaPerPelanggan, totalHarga=0;
        System.out.println("MASUKKAN JUMLAH PELANGGAN :" );
        jumlah = sc.nextInt();

        while (i < jumlah) {
            System.out.print("MASUKKAN JUMLAH TIKET PELANGGAN ke "+ (i+1) + ":" );
            tiket=sc.nextInt();
            if (tiket < 0) {
                System.out.println("TIKET TIDAH VALID. MASUKKAN LAGI TIKET YANG VALID");
                continue;   
            }
            if (tiket >0 && tiket<4) {
                hargaPerPelanggan = hargaTiket;
                System.out.println("PELANGGAN KE "+i+1+"HARGA YANG HARUS ANDA BAYAR :" +hargaPerPelanggan);
                
            } else if (tiket >3 && tiket <=10) {
                hargaPerPelanggan =  hargaTiket + (hargaTiket*0.1);
                System.out.println("PELANGGAN KE "+i+1+"HARGA YANG HARUS ANDA BAYAR :" +hargaPerPelanggan);
            } else {
                hargaPerPelanggan = hargaTiket + (hargaTiket*0.15);
                System.out.println("PELANGGAN KE "+i+1+"HARGA YANG HARU SANDA BAYAR :" +hargaPerPelanggan);
            }
            totalHarga += hargaPerPelanggan;
            totalTiket += tiket;
            i++;
        }
        System.out.println("TOTAL PENJUALAN TIKET 1 HARI \t="+totalTiket);
        System.out.println("TOTAL PENDAPATAN 1 HARI \t\t=" + totalHarga);
    }
    
}
