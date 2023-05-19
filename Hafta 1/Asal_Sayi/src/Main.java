public class Main {
    public static void main(String[] args) {

        System.out.println("1-100 arasindaki asal sayilar:");

        // 2'den başlayarak 100'e kadar olan sayıları kontrol ediyoruz
        for(int i = 2 ; i <= 100 ; i++){
            boolean asal_mi = true;  // Bir sayının asal olup olmadığını belirlemek için bir boolean değişken kullanıyoruz

            // i sayısını, 2'den başlayarak o sayıya kadar olan tüm değerlerle bölme işlemi gerçekleştiriyoruz
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){  // Eğer i sayısı j'ye tam bölünüyorsa, asal değildir
                    asal_mi = false;
                    break;  // İç döngüden çıkıyoruz çünkü bir sayıya tam bölünmüşse asal değildir
                }
            }
            if (asal_mi){  // asalMi değişkeni true ise, sayı asaldır
                System.out.println(i);
            }
        }
    }
}