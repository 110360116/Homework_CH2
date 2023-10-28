import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_13 {
    public static void main(String[] args)throws IOException{
        System.out.println("How many times would you like to loop for? (1~10)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        for(int i = 1; i <= 10; i++){
            System.out.println("The " + i + "th loop");
            if(i == res)
                break;
        }
    }
}
