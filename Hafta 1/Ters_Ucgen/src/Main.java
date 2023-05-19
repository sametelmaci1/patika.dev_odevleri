import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayısı Giriniz : ");
        int step = scan.nextInt();

        // Basamak değerinden başlayarak üçgenin yüksekliğinin belirlenmesi
        for(int i = step ; i >= 1 ; i--){
            // Her satırdaki boşlukların sayısının belirlenmesi
            for(int j = 1 ; j <= step-i ; j++){
                System.out.print(" ");
            }
            // Her satırdaki yıldızların sayısını belirler
            for(int k = 1 ; k <= i*2-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}