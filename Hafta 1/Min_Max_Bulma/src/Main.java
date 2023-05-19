import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int sayi_adedi = scan.nextInt();

        int en_buyuk = 0;
        int en_kucuk = 0;

        // İlk sayının girildiği durum takibi
        boolean ilk_sayi = true;

        for(int i = 1 ; i <= sayi_adedi ; i++){
            System.out.print(i+". Sayıyı Giriniz : ");
            int sayi = scan.nextInt();

            // İlk sayi en_büyük ve en_küçük değişkenlerine atanır ve ilk_sayi değişkeni false yapılır
            if(ilk_sayi){
                en_buyuk = sayi;
                en_kucuk = sayi;
                ilk_sayi = false;
            }
            // Girilen sayıları mevcut en büyük ve en küçük değerleriyle karşılaştırarak güncellenir
            else{
                if (sayi > en_buyuk){
                    en_buyuk = sayi;
                }
                if (sayi < en_kucuk){
                    en_kucuk = sayi;
                }
            }
        }
        System.out.println("En büyük sayı : "+en_buyuk);
        System.out.println("En küçük sayı : "+en_kucuk);
    }
}