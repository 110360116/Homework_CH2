import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_1 {
    public static void main(String[] args)throws IOException{
        System.out.println("Please Enter an Integer");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num == 1){
            System.out.println("The Number Entered is 1");
            System.out.println("Chosen is 1");
        }
        System.out.println("End of Processing");
    }
}
