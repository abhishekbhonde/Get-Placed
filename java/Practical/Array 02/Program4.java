import java.util.*;

class searchElement{

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
                if(element == arr[i]){
                    System.out.println(i);
                }
        }
      




    }
}