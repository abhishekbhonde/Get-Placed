import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= Integer.parseInt(sc.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());

        }
            for (int i= 0; i < arr.length; i++) {
                int sum =0;
                for (int k = 1; k < arr[i]; k++) {
                    if(arr[i]%k==0)
                    sum = sum + arr[i];
                }
                if(sum == arr[i]){
                    System.out.println("The perfect number " +arr[i] +"is at index of" +i);
                }
            }
        }
    }
