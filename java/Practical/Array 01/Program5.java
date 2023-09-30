import java.io.*;

class Divisibleby5{

    public static void main(String[] args)throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int [] arr = new int [10];
            int num=0;
            for(int i =0; i<arr.length; i++){

                arr[i] = Integer.parseInt(br.readLine());

            }
            System.out.println("The numbers divisible are ");
            for(int i =0; i<arr.length; i++){
                if(arr[i]%5==0){
                    System.out.println(arr[i]);
                }
            }
            

    }
}
