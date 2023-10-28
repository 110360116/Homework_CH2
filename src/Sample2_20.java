import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 5 numbers");
        int num[] = new int[5];
        for(int i = 0; i < num.length; i++){
            String str = br.readLine();
            num[i] = Integer.parseInt(str);
        }
        for(int s = 0; s < num.length-1; s++){
            for(int t = s+1; t < num.length; t++){
                if(num[t] > num[s]){
                    int tmp = num[t];
                    num[t] = num[s];
                    num[s] = tmp;
                }
            }
        }
        for(int i = 0; i < num.length; i++){
            System.out.println("第" + (i+1) + "大的數字是" + num[i]);
        }
    }
}
