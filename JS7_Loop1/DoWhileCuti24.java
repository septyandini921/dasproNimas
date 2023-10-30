import java.util.Scanner;
public class DoWhileCuti24 {
    public static void main(String[] args) {
    //deklarasi
    int jatahCuti, jumlahHari;
    String konfirmasi;
    Scanner sc = new Scanner(System.in);

    //program
    System.out.print("Jatah cuti: ");
    jatahCuti = sc.nextInt();

    do {
        System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            }else {
                System.out.println("Sisa jatah cuti anda tidak mencukupi");
            
            } 
        } else {
            System.out.println("Anda tidak mengambil cuti"); 
            break;
        }
    } while (jatahCuti > 0);

    }
    
}
