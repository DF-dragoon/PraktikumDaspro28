
// PARAMETER UNIK 
// hargaKopi = 13000
// hargaTeh = 5000
// hargaRoti = 19000
import java.util.Scanner;
public class KafeDoWhile28 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 13000, hargaTeh=5000, hargaRoti = 19000, totalHarga;

        do {
            System.out.println("MASUKKAN NAMA PELANGGAN (KETIK 'BATAL' UNTUK KELUAR): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah Roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("TOTAL HARGA YANG HARUS ANDA BAYAR: Rp"+totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("SEMUA TRANSAKSI SELESAI");
    }
}
