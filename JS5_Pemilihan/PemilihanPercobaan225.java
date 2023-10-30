import java.util.Scanner;

public class PemilihanPercobaan225 {
    public static void main(String[] args) {
    Scanner input00 = new Scanner(System.in);
    
    System.out.print("Nilai uas   : ");
    float uas = input00.nextFloat();
    System.out.print("Nilai UTS   : ");
    float uts = input00.nextFloat();
    System.out.print("Nilai kuis  :");
    float kuis = input00.nextFloat();
    System.out.print("Nilai tugas : ");
    float tugas = input00.nextFloat();
    float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
    if (total>80){
        System.out.println("Nilai anda A");
    }
    else if (total>73){
        System.out.println("Nilai anda B+");
    }
     else if (total>65){
        System.out.println("Nilai anda B");
    }
     else if (total>60){
        System.out.println("Nilai anda c+");
    }
     else if (total>50){
        System.out.println("Nilai anda C");
    }
     else if (total>39){
        System.out.println("Nilai anda D");
    }
     else if (total<39){
        System.out.println("Nilai anda E");
    }
    String message = total < 65 ? "Remidi" : "Tidak remidi";
    System.out.println("Nilai akhir = " +total+ " sehingga " +message);


    
   }


    }
    

