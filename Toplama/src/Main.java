import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ilk sayımızı alıyoruz
        int sayi1=0;
        Scanner klavye=new Scanner (System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1= klavye.nextInt();

        //ikinci sayımızı alıyoruz
        int sayi2=0;
        Scanner klavye2=new Scanner (System.in);
        System.out.println("ikinci sayıyı giriniz: ");
        sayi2=klavye2.nextInt();

        //üçüncğ sayımızı alıyoruz
        int sayi3=0;
        Scanner klavye3=new Scanner (System.in);
        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3=klavye3.nextInt();

        // üç sayının toplamını buluyoruz
        int toplam=0;
        toplam=sayi1+sayi2+sayi3;
        System.out.println(" Üç sayının toplamı: "+ toplam);

    }
}