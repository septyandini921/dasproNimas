import java.util.Scanner;
public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
    Scanner input25 = new Scanner(System.in);
    int totalSudut;

    System.out.println("Masukkan sudut 1: ");
    int sudut1 = input25.nextInt();
    System.out.println("Masukkan sudut 2: ");
    int sudut2 = input25.nextInt();
    System.out.println("Masukkan sudut 3: ");
    int sudut3 = input25.nextInt();

    totalSudut = sudut1 + sudut2 + sudut3;

if (totalSudut == 180) {
    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
        System.out.println("Segitiga tersebut adalah segitiga siku-siku");
    else
        System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
} else
    System.out.println("Bukan Segitiga");

    }
}
