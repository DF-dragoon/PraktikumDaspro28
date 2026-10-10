import java.util.Scanner;

public class StudiKasus228 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int jumlahDokumen, peringkatJuara, kurangDokumen, statusPendanaan;
        String namaMahasiswa, jenisKegiatan;

        System.out.print("MASUKKAN NAMA MAHASISWA :");
        namaMahasiswa=sc.nextLine();
        System.out.print("MASUKKAN JENIS KEGIATAN (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :");
        jenisKegiatan=sc.nextLine();
        System.out.print("MASUKKAN JUMLAH DOKUMEN ANDA :");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("MASUKKAN PERINGKAT JUARA :");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara >=1 && peringkatJuara <=3) {
                System.out.println("SELAMAT ANDA JUARA :" + peringkatJuara);
                if (jumlahDokumen >=4 && jumlahDokumen <=4) {
                    System.out.println("DOKUMEN ANDA LENGKAP, SILAKAN AMBIL DANA PENDANAAN");
                    
                } else {
                    kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("DOKUMEN ANDA KURANG (" +kurangDokumen +") SILAHKAN LENGKAPI DOKUMEN ANDA");

                }
            } else {
                System.out.println("MAAF ANDA BELUM JUARA, TETAP SEMANGAT");
                
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("MASUKKAN STATUS PENDANAAN (0/1) :");
            statusPendanaan = sc.nextInt();
            if (jumlahDokumen >=4 && jumlahDokumen <=4) {
                statusPendanaan = 1;
                System.out.println("DOKUMEN ANDA LENGKAP, SILAKAN AMBIL DANA ANDA");
                
            } else {
                kurangDokumen = 4 - jumlahDokumen;
                System.out.println("DOKUMEN TIDAK LENGKAP, DOKUMEN ANADA KURANG (" + kurangDokumen +").DANA TIDAK DIBERIKAN");
            }
            
        } else {
            statusPendanaan = 0;
            System.out.println("ANDA TIDAK LOLOS PENDANAAN, SILAKAN COBA DILAIN WAKTU");
        }      
    }
}
    


    

