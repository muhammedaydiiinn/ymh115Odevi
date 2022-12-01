import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int sayi = klavye.nextInt();

        if (sayi % 2 == 0 && sayi % 3 == 0)
            System.out.println(sayi + "sayısı  2 ve 3'e tam bölünür.");
        if (sayi % 2 == 0 || sayi % 3 == 0)
            System.out.println(sayi + "sayısı  2 veya 3'e tam bölünebilir.");
        if (sayi % 2 == 0 ^ sayi % 3 == 0)
            System.out.println(sayi + "sayısı  2 ve 3'e tam bölünür, her ikisibe bölünemez. ");
    }
}