import java.util.Scanner;

class ScannerSwitch{
    public static void main(String[] args) {

        Scanner abhi = new Scanner(System.in);
        System.out.println("choose the option 1, 2, 3,");

        int num = abhi.nextInt();

        switch(num){

            case 1: 
            System.out.println("This is case 1");
            break;
            case 2: 
            System.out.println("This is case 2");
            break;
            case 3: 
            System.out.println("This is case 3");
            break;

            default:
            System.out.println("This is default one");
            break;


        }
        


    }
}