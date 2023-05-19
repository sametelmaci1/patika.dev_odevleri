import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        int year = scan.nextInt();

        // Girilen Yılın Artık Yıl Olup Olmadığını Kontrol Eden Koşul
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year+" yılı bir artık yıldır.");
        }
        else{
            System.out.println(year+" yılı bir artık yıl değildir.");
        }
    }
}