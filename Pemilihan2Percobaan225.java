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
        System.out.print("Segitiga tersebut adalah segitiga siku-siku");
    else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
        System.out.print("Segitiga tersebut adalah segitiga sama sisi");
    else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
        System.out.print("Segitiga tersebut adalah segitiga sama kaki");
    else if ((sudut1<180) && (sudut2<180) && (sudut3<180))
        System.out.print("Segitiga tersebut adalah segitiga sembarang");
} else
    System.out.println("Bukan Segitiga");

    }
}
