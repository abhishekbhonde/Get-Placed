
import java.util.Scanner;

class Program3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = Integer.parseInt(sc.nextLine());
        int arr [] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            
            for (int j = 0; j < arr.length; j++) {
                int count = 0;
                if(arr[i]%j==0){
                        count++;
                }
            if(count>=2){
                System.out.println("The number " +arr[i] +"is at index"+i);
            }
            }
            
        }
    }
}