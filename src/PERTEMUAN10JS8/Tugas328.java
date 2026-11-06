import java.util.Scanner;
public class Tugas328 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <1) {
            System.out.println("Jumlah toko harus diatas 0");
        } else {
            int totalToko = 0;
            int tokoTerbanyak =0;
            int barangTerbanyak =0;

            for (int toko = 1; toko <= jumlahToko; toko++) {  
                int jumlahPelanggan;
                do {
                    System.out.print(" Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;                       

                for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {   
                    int barang;
                    do {
                        System.out.print("  Barang yang dibeli pelanggan " + pelanggan + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {       
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }
            System.out.println("Total barang seluruh toko: " + totalToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }   
}
