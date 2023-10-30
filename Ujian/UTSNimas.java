import java.util.Scanner;

public class UTSNimas {
public static void main(String[] args) {
    //deklarasi 
    int nilaiAk, nilaiBig, nilaiWw, jml;
    double ttlNilai;
   
    Scanner input =new Scanner(System.in);

    System.out.println("Masukkan Jumlah Mahasiswa");
    jml= input.nextInt();

    int i = 0;
    
    do {
    System.out.print("Masukkan Nilai Potensi Akademik (0-100)" );
    nilaiAk = input.nextInt();
    System.out.print("Masukkan Nilai Bahasa Inggris (0-100)" );
    nilaiBig = input.nextInt();
    System.out.print("Masukkan Nilai Wawancara (0-100)" );
    nilaiWw = input.nextInt();
    //hitung total nilai //potensi akademik 50% bing 30% wawancara 20%
   ttlNilai=(nilaiAk*0.5)+(nilaiBig*0.3)+(nilaiWw*0.2);
   System.out.println("Total Nilai Tes Adalah: " + ttlNilai);

   //jurusan
    System.out.println("Anda dapat diterima di jurusan: ");
   if (nilaiBig>=70 && nilaiWw>80) {
    System.out.println("Sistem informasi");
   }
   if ((nilaiBig>70&&nilaiBig>70&&nilaiWw>70) || (nilaiBig==100||nilaiBig==100||nilaiWw==100)){
    System.out.println("ilmu komputer");
   }
   if (ttlNilai>=75 && nilaiBig>50) {
    System.out.println("bisnis manajemen");
   }
   if ((nilaiBig>60&&nilaiBig>60&&nilaiWw>60) || (nilaiBig==100&&nilaiAk==100)) {
    System.out.println("teknik informatika");
   }
   
} while (i==jml);
}

}
    

