package PROJECTJAVA.src.PERTEMUAN7;
import java.util.Scanner;

public class StudiKasus1282 {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int hargaPercup = 19000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("MASUKKAN JUMLAH CUP YANG DINGINKAN \t:");
        jumlahCup = sc.nextInt();
        System.out.print("MASUKKAN UANG ANDA \t\t\t:Rp");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;

        if (totalHarga >=110000) {
            diskon = totalHarga * 9/100;
        } else { diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("TOTAL HARGA \t\t\t\t:Rp" + totalHarga);
        System.out.println("DISKON \t\t\t\t\t:Rp" + diskon);
        System.out.println("TOTAL BAYAR \t\t\t\t:Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("KEMBALIAN \t\t\t\t:Rp" +kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("UANG KURANG \t\t\t: Rp" +kurang);
        }
    }   
}