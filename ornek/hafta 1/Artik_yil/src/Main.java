import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yil = 0;
        System.out.print("Yıl giriniz: ");
        yil= scan.nextInt();
        if((yil % 400 == 0 || yil % 100 != 0) && yil % 4 == 0 ){
            System.out.println(yil+" Artık yıldır");
        }
        else{
            System.out.println(yil+" Artık yıl değildir");

        }
    }
}