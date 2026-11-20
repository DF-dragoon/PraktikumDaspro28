import java.util.Scanner;

public class Tugas2APKK28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.println();
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu " + menu[i] + " tersedia, harga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        System.out.println();
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];   
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int k = 0; k < jumlah; k++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Pesanan ke-" + (k + 1) + ": ");
                String nama = input.nextLine();

                // Validasi nama menu dengan linear search
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(nama)) {
                        pesanan[k] = menu[i];
                        hargaPesanan[k] = harga[i];
                        total += harga[i];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia, silakan input ulang.");
                }
            }
        }

        // Tampilkan daftar pesanan dan total biaya
        System.out.println();
        System.out.println("=== DAFTAR PESANAN ===");
        for (int k = 0; k < pesanan.length; k++) {
            System.out.println((k + 1) + ". " + pesanan[k] + " - Rp " + hargaPesanan[k]);
        }
        System.out.println("----------------------");
        System.out.println("Total biaya: Rp " + total);
    }
}
