import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class pattern1{
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number of rows");
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i<=num; i++){
            char ch = 'D';
            int n = 4;
            for(int j = 1; j<=num; j++){
                System.out.println(ch-- +""+ n--);

            }
            System.out.println();
        }
        
    }
}

