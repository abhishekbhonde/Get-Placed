import java.util.Scanner;

class Program6{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(sc.nextLine());
            
        }
        for (int i = 0; i < arr.length; i++) {
            int num =arr[i];
            int count ,sum =0;
            while(num!=0){
                count++;
                num = num/10;
            }
            num =arr[i];

        }
        while(num!=0){
            int mult =1;
            int rem = num%10;
            for (int i = 0; i < arr.length; i++) {
                mult = mult*rem;
            }

            sum = sum +mult;
            num = num/10;

        }
        if(sum == arr[i])

    }
}