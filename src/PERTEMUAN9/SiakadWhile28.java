
import java.util.Scanner;
public class SiakadWhile28 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int nilai, jumlah, i=0;
        System.out.print("MASUKKAN JUMLAH MAHASISWA :");
        jumlah = sc.nextInt();
        while (i<jumlah) {
            System.out.println("MASUKKAN NILAI MAHASISWA KE-" +(i+1) + ":");
            nilai =sc.nextInt();
            if (nilai<0||nilai>100) {
                System.out.println("NILAI TIDAH VALID. MASUKKAN LAGI NILAI YANG VALID");
                continue;
            }
            if (nilai>80 &&nilai<=100) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH A");
            } else if (nilai >73 && nilai <= 80) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH B+");
            } else if (nilai >65 && nilai<=73) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH B");
            } else if (nilai >60 && nilai <=65) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH C+");
            } else if (nilai >50 && nilai <=60) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH C");
            } else if (nilai >39 && nilai <=50) {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH D");
            } else {
                System.out.println("NILAI MAHASISWA KE-" + (i+1) +"ADALAH E");   
            }
            i++;
        }
    }    
}
