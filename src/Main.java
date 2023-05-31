import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili;
        System.out.println("Çin zodyagına göre burcunuzu ögrenmek için Lutfen yasinizi giriniz : ");
        dogumYili=input.nextInt();



        switch (dogumYili%12){
            case 0 :
                System.out.println("Çin zodyagı burcunuz Maymun");
                break;
            case 1:
                System.out.println("Çin zodyagı burcunuz Horoz");
                break;
            case 2 :
                System.out.println("Çin zodyagı burcunuz Köpek");
                break;
            case 3:
                System.out.println("Çin zodyagı burcunuz Domuz");
                break;
            case 4 :
                System.out.println("Çin zodyagı burcunuz Fare");
                break;
            case 5 :
                System.out.println("Çin zodyagı burcunuz Öküz");
                break;
            case 6 :
                System.out.println("Çin zodyagı burcunuz Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyagı burcunuz Tavşan");
                break;
            case 8 :
                System.out.println("Çin zodyagı burcunuz Ejdarha");
                break;
            case 9 :
                System.out.println("Çin zodyagı burcunuz Yılan");
                break;
            case 10 :
                System.out.println("Çin zodyagı burcunuz At");
                break;
            case 11:
                System.out.println("Çin zodyagı burcunuz Koyun");
                break;
            default:
                System.out.println("Hatali tuslama yaptiniz");


        }


        }
    }
