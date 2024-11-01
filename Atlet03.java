import java.util.Scanner;

public class Atlet03 { 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
                int jmlPoliteknik = sc.nextInt();
                
                for (int p = 1; p <= jmlPoliteknik; p++) {
                    System.out.println("\nPoliteknik ke-" + p + ":");
        
                    System.out.print("Masukkan nama cabang olahraga: ");
                    String cabor = sc.next();
        
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Masukkan nama atlet " + i + " untuk cabang " + cabor + ": ");
                        String namaAtlet = sc.next();
                        System.out.println("Atlet " + i + " untuk " + cabor + ": " + namaAtlet);
                    }
                }
                
            sc.close();
    }
}