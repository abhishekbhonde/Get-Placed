import java.util.*;

class Program1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = Integer.parseInt(sc.nextLine());

        int arr [] = new int [size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < arr.length; j++) {
                int count =0;
                int temp = arr[i];
                while(temp!=0){
                    count++;
                    temp = temp/10;
                }
                System.out.println("count of digit in number "+arr[i] +"=" +count);
            }
        }

    }

}