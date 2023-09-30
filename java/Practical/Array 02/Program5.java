import java.util.*;

class minelement{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];
            }
            System.out.println("Min element is " +arr[i]);
        }
        
    }
}