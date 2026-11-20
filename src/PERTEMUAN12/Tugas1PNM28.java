import java.util.Scanner;
public class Tugas1PNM28 {
    public static void main (String[]args){
        Scanner doni = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int total = 0;
        double rataRata;

        for ( int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("MASUKKAN NILAI MAHASISWA KE-" + (i+1) + ": ");
            nilaiMhs[i] = doni.nextInt();
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70)? "LULUS" : "TIDAK LULUS";
            System.out.println("MAHASISWA KE-"+ (i+1) + ": " + nilaiMhs[i]+  " (" + status + ")");
        }

        rataRata = (double) total/nilaiMhs.length;
        System.out.println("TOTAL NILAI    : " +total);
        System.out.println("RATA RATA      : " +rataRata);
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i]<terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah : " +terendah);
        doni.close();
    }
}
