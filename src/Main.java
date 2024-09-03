import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("write number and take ur advice:");

        int value= input.nextInt(); // Kullanıcıdan bir üst sınır değeri al
        switch (value){
            case 1:
                System.out.println("u look so sweet");
            break;

            case 2:
               System.out.println("have a nice day ");
            break;

            case 3:
                System.out.println("u should drink water ");
                break;

            default:
                //hicbiri ise burası
            break;

        }

        input.close(); // Scanner'ı kapat
    }
}
