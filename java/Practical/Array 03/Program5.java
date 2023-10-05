import java.util.Scanner;

class Program5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = Integer.parseInt(sc.nextLine());
        int arr [] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < arr.length; j++) {
                int rev =0;
                int num = arr[i];
                while(num!=0){
                        int rem = num %10;
                        rev = rev*10+rem;
                        num = num/10;
                }   
                if(rev == arr[i]){
                    System.out.println("Pallindrome number "+rev +"found at" +i);
                }
            }
        }

    }
}