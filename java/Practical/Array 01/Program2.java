import java.io.*;

class productarr{
    public static void main(String[] args)throws IOException {
        
   
    int prod = 1;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of array");

    int size = Integer.parseInt(br.readLine());

    int arr [] = new int[size];

    for(int i = 0 ; i<=arr.length; i++){

        arr[i]= Integer.parseInt(br.readLine());
        if(arr[i] %2 == 0){
            prod = prod * arr[i];
        }
    }
    System.out.println(prod);

}

}