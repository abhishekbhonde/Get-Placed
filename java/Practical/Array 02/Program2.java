import java.io.*;
import java.util.*;
class evenodd{

    public static void main(String[] args) {
        int evencount =0;
        int oddcount =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The even numbers are " +evencount);
        System.out.println("The even numbers are " +oddcount);
    }
}