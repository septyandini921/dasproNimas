import java.util.Scanner;

    public class Lingkaran25 {
        public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int r;
        double phi, keliling, luas;
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        phi= 3.14;

        keliling= 2*phi*r;
        luas=phi*r*r;

        System.out.println("Keliling: " + keliling);
        System.out.println("Luas: " + luas);

        }

    
}
