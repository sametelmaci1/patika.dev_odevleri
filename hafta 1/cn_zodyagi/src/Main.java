import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int yil;
        System.out.println("Doğum yılınızı giriniz: ");
        yil= scan.nextInt();

        if(yil%12==0){
            System.out.println("Çin zodyağı burcunuz maymun");
        }

        else if(yil%12==1){
            System.out.println("Çin zodyağı burcunuz horoz");
        }

        else if(yil%12==2){
            System.out.println("Çin zodyağı burcunuz köpek");
        }

        else if(yil%12==3){
            System.out.println("Çin zodyağı burcunuz domuz");
        }

        else if(yil%12==4){
            System.out.println("Çin zodyağı burcunuz fare");
        }

        else if(yil%12==5){
            System.out.println("Çin zodyağı burcunuz öküz");
        }

        else if(yil%12==6){
            System.out.println("Çin zodyağı burcunuz kaplan");
        }

        else if(yil%12==7){
            System.out.println("Çin zodyağı burcunuz tavşan");
        }

        else if(yil%12==8){
            System.out.println("Çin zodyağı burcunuz ejderha");
        }

        else if(yil%12==9){
            System.out.println("Çin zodyağı burcunuz yılan");
        }

        else if(yil%12==10){
            System.out.println("Çin zodyağı burcunuz at");
        }

        else if(yil%12==11){
            System.out.println("Çin zodyağı burcunuz koyun");
        }


    }
}