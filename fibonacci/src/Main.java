import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int n = reader.nextInt();
        int birinci =1 , ikinci=1, toplam=0;
        System.out.print(birinci +", " + ikinci);
        for (int i=2; i<n; i++)
        {
            toplam = birinci +ikinci ;
            birinci = ikinci;
            ikinci = toplam;
            System.out.print(", " + toplam);
        }
    }
}