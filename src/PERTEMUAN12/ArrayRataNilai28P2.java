import java.util.Scanner;
public class ArrayRataNilai28P2 {
    public static void main (String[]args){
        Scanner doni = new Scanner(System.in);

        // MODIFIKASI PERTANYAAN2 
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = doni.nextInt();
        int[] nilaiMhs = new int[n];
        int total = 0;
        double rataRata;
        int lulus =0;

        for ( int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(" MASUKKAN NILAI MAHASISWA KE-" + (i+1) + ": ");
            nilaiMhs[i] = doni.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        rataRata = (double) total/nilaiMhs.length;
        System.out.println("TOTAL NILAI: " +total);
        System.out.println("RATA RATA: " +rataRata);

        rataRata = (double) total /nilaiMhs.length;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i]<terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " +terendah);

        String predikat;
        if (rataRata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rataRata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
    

        doni.close();
    }
    
}
