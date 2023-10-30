import java.util.Scanner;
public class ArrayTugasNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyakElemen;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;
        int total = 0;

        System.out.print("Masukkan banyaknya elemen: ");
        banyakElemen = sc.nextInt();
        int[] nilai = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            //tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            // terendah
            if (nilai[i] < nilaiTerendah || nilaiTerendah == 0) {
                nilaiTerendah = nilai[i];
            }
            total += nilai[i];
        }

        double rata2 = total / banyakElemen;
        //output
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rata2);
    }
}

// import java.util.Scanner;
// public class ArrayTugasNilai {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int banyakElemen;
//         int nilaiTertinggi = Integer.MIN_VALUE;
//         int nilaiTerendah = Integer.MAX_VALUE;
//         int total = 0;

//         System.out.print("Masukkan banyaknya elemen: ");
//         banyakElemen = sc.nextInt();
//         int[] nilai = new int[banyakElemen];

//         for (int i = 0; i < banyakElemen; i++) {
//             System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
//             nilai[i] = sc.nextInt();

//             //tertinggi
//             if (nilai[i] > nilaiTertinggi) {
//                 nilaiTertinggi = nilai[i];
//             }
//             // terendah
//             if (nilai[i] < nilaiTerendah) {
//                 nilaiTerendah = nilai[i];
//             }
//             total += nilai[i];
//         }

//         double rata2 = total / banyakElemen;
//         //output
//         System.out.println("Nilai tertinggi: " + nilaiTertinggi);
//         System.out.println("Nilai terendah: " + nilaiTerendah);
//         System.out.println("Rata-rata: " + rata2);
//     }
// }
