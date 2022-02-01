import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n - 1; i > 0; i--) {

            for (int p = (n - i); p >= 0; p--) {
                System.out.print(" ");
            }
            for (int l = (2 * i - 1); l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
