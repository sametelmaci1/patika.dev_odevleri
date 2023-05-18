import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = scan.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        int tip = scan.nextInt();

        double birim_fiyati = 0.1; // Mesafe başına ücret (0,10 TL)
        double toplam_fiyat = birim_fiyati * mesafe; //Uçuşun toplam fiyatı

        // Veri Kontrolü
        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)){
            // Uçuş Tipi Kontrolü (1)
            if(tip == 1){
                // Yaşa Göre İndirim Uygulanması
                if(yas < 12){
                    toplam_fiyat *= 0.5; // %50 indirim
                }
                else if(yas >= 12 && yas <= 24){
                    toplam_fiyat *= 0.9; // %50 indirim
                }
                else if(yas >= 65){
                    toplam_fiyat *= 0.7; // %30 indirim
                }
            }
            // Uçuş Tipi Kontrolü (2)
            else if(tip == 2){
                // Yaşa Göre İndirim Uygulanması
                if(yas < 12){
                    toplam_fiyat *= 0.5; // %50 indirim
                }
                else if(yas >= 12 && yas <= 24){
                    toplam_fiyat *= 0.9; // %50 indirim
                }
                else if(yas >= 65){
                    toplam_fiyat *= 0.7; // %30 indirim
                }
                toplam_fiyat = (toplam_fiyat * 0.8) * 2; // %20 indirim ve Gidiş Dönüş Bilet Fiyatı Hesabı

            }
            System.out.println("Toplam Tutar = "+toplam_fiyat+"TL");
        }
        else{
            System.out.println("Hatalı Veri Girdiniz ! Lütfen Tekrar Deneyiniz.");
        }
    }
}