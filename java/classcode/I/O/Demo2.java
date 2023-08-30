import java.util.Scanner;

class ScannerDemo{

    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter you name ");
            String Fname = obj.next();
            System.out.println("Your first name is " +Fname);

            System.out.println("Enter your last name");
            String Last = obj.next();
            System.out.println("Your last name is " +Last);

            System.out.println("Your nam is " +Fname + " " +Last);


    }
}