import java.util.Scanner;
public class Main {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci Serisi istiyorsunuz : ");
        int n = input.nextInt();
        int sayi = 0, sayi2 = 1, toplam;

        System.out.print(sayi + " " + sayi2);

        for (int i = 2 ; i <= n ; i++){
            toplam = sayi + sayi2;
            sayi = sayi2;
            sayi2 = toplam;
            System.out.print(" " + toplam);
        }

    }
}
