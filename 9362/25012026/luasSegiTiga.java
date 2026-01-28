 import java.util.Scanner;
 
public class luasSegiTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sila masukkan nilai tapak "); // PAPAR ARAHAN "Sila masukkan nilai tapak"
        int tapak = input.nextInt();                         // INPUT tapak

        System.out.println("Sila masukkan nilai tinggi "); // PAPAR ARAHAN "Sila masukkan nilai tinggi"
        int tinggi = input.nextInt();                   // INPUT tinggi

        double luas = (1.0/2)* tapak * tinggi;          // luas = 1/2 * tapak * tinggi
        System.out.println("Luas segi tiga ialah : " + luas); // PAPAR "Luas segi tiga ialah : " + luas
    }
}
