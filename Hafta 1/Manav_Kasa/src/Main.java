import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Armut = 2.14F;
        float Elma = 3.67F;
        float Domates = 1.11F;
        float Muz = 0.95F;
        float Patlican = 5.00F;
        float toplam;

        System.out.print("Armut Kaç Kilo ? : ");
        float a = scan.nextFloat();

        System.out.print("Elma Kaç Kilo ? : ");
        float e = scan.nextFloat();

        System.out.print("Domates Kaç Kilo ? : ");
        float d = scan.nextFloat();

        System.out.print("Muz Kaç Kilo ? : ");
        float m = scan.nextFloat();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        float p = scan.nextFloat();

        toplam = (Armut*a)+(Elma*e)+(Domates*d)+(Muz*m)+(Patlican*p);
        System.out.print("Toplam Tutar : "+toplam);

    }
}