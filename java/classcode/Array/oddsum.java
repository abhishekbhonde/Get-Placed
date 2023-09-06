import java.io.*;
class oddsum {
        public static void main(String[] args)throws IOException {
            int oddSum =0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter size of elements");
            int size = Integer.parseInt(br.readLine());

            int arr [] =  new int [size];   
            for (int i = 0; i < arr.length; i++) {
                    arr[i]=Integer.parseInt(br.readLine());              
            }

            for (int i = 0; i < arr.length; i++) {
                    if(arr[i]%2==1){
                         oddSum = oddSum + arr[i];
                    }
            }
            System.out.println(oddSum);
        }    
}
