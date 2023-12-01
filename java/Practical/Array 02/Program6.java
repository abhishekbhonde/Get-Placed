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
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];
            }
        }
                    System.out.println("Max element is " +max);

        
    }
}