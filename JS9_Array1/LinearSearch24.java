import java.util.Scanner;


public class LinearSearch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyakElemen;
        int[] arrayInt;
        int key;
        int hasil = 0;
        
        // Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        banyakElemen = sc.nextInt();
        arrayInt = new int[banyakElemen];

        // Input isi array
        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        // cari key
        for (int i = 0; i < banyakElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        //hasil
        if (hasil == 0) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        }
    }
}


