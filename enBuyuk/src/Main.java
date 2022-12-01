import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int sayi1 = reader.nextInt();
        System.out.print("Bir Sayı Girin: ");
        int sayi2 = reader.nextInt();
        System.out.print("Bir Sayı Girin: ");
        int sayi3 = reader.nextInt();
       int enBuyuk = sayi1;
       if (enBuyuk<sayi2){

           enBuyuk = sayi2;
       }
        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük = " + enBuyuk);
    }

}