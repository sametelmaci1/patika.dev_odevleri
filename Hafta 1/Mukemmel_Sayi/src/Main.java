import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int num = scan.nextInt();

        int sum = 0;

        for(int i = 1 ; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
            if(sum == num){
                System.out.println(num+" Mükemmel sayıdır.");
            }
            else{
                System.out.println(num+" Mükemmel sayi değildir");
            }
    }
}