import java.util.Scanner;

public class HargaBayar25 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int  jmlHlmBuku, harga, jumlah;
        double dis, total, bayar, jmlDis;
        String merkBuku;
        

        System.out.println("Masukkan Merk Buku ");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jmlHlmBuku=input.nextInt();
        
        System.out.println("Masukkan harga barang yang di beli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan besaran diskon ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +  bayar);



    }

}
