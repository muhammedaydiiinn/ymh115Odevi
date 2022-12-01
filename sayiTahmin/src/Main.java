
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Bir Sayı Girin: ");
        int sayi = rnd.nextInt(101);
        int tahmin = input.nextInt();

        while ( tahmin != sayi ) {
            if (tahmin <0  || tahmin > 101)
            {
                System.out.println("Yanlış sayı girdiniz!");
                tahmin = input.nextInt();
            }
            else if (tahmin < sayi)
            {
                System.out.println("Daha büyük bir sayı giriniz.");
                tahmin = input.nextInt();
            }
            else
            {
                System.out.println("Daha küçük bir sayı giriniz.");
                tahmin = input.nextInt();
            }

        }
        System.out.println("Tahmin Doğru!");


    }
}