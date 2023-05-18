import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo;
        kilo = scan.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy;
        boy = scan.nextDouble();

        double vucut_kitle_indeksi;
        vucut_kitle_indeksi = kilo / (boy*boy);

        System.out.print("Vücut Kitle İndeksiniz : "+vucut_kitle_indeksi);
    }
}