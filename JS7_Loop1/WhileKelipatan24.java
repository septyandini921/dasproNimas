import java.util.Scanner;

public class WhileKelipatan24 {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    //deklarasi
    int kelipatan, jumlah, counter;
    double rataRata;
    jumlah= 0;
    counter= 0;
    
    //program
    System.out.print("Masukkan bilangan kelipatan (1-9); ");
    kelipatan =  scan.nextInt();

    int i = 1;
    while (i <= 50) {
         if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
        i++;
    }
    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    rataRata = jumlah/counter;
    System.out.println("Rata - rata seluruh bilangan kelipatan: " + rataRata);

    }
}
