// PARAMETER UNIK = 73

import java.util.Scanner;
public class ArrayNilai28 {
    public static void main (String[]args){
        Scanner doni = new Scanner (System.in);

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("MASUKKAN NILAI MAHASISWA KE-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        int lulus=0;
        int tidakLulus=0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70)? "LULUS" : "TIDAK LULUS";
            System.out.println("MAHASISWA KE-"+ (i+1) + ": " + nilaiAkhir[i]+  " (" + status + ")");

        // MODIFIKASI PERTANYAAN 3 (modifikasi for loop menjadi for each)
        // int nomer = 1;
        // for (int nilai : nilaiAkhir) {
        //     String status =(nilai > 70)? "LULUS" : "TIDAK LULUS";
        //     System.out.println("MAHASISWA KE-"+ nomer + ": " + nilai+  " (" + status + ")");
        // }

            // MODIFIKASI PROGRAM PERTANYAAN 2 (MENAMPILKAN YANG LULUS SAJA)
            // if (nilaiAkhir[i] > 70) {
            //     System.out.println("MAHASISWA KE- " +(i+1)+ ": " +nilaiAkhir[i]+ "(LULUS)");
            // }

            // MODIFIKASI PROGRAM PERTANYAAN 4 MENAMPILKAN TOTAL LULUS DAN TIDK LULUS (KODE IF ELSE DIBAWAH INI)
            if (nilaiAkhir[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("TOTAL YANG LULUS :" +lulus);
        System.out.println("TOTAL YANG TIDAK LULUS :" +tidakLulus);
        doni.close();
    }
}
