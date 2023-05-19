import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayisini girin : ");
        int eleman_sayisi = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        System.out.print(sayi1 + " " + sayi2 + " ");

        for(int i = 3; i <= eleman_sayisi; i++){
            int yeni_sayi = sayi1 + sayi2;
            System.out.print(yeni_sayi + " ");

            sayi1 = sayi2;
            sayi2 = yeni_sayi;
        }
    }
}