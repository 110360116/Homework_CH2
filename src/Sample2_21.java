import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Sample2_21 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 5 numbers");
        Integer num[] = new Integer[5];
        for (int i = 0; i < num.length; i++) {
            String str = br.readLine();
            num[i] = Integer.parseInt(str);
        }
        Arrays.sort(num, Comparator.naturalOrder());
        for(int i = 0; i < num.length; i++){
            System.out.println("第" + (i+1) + "小的數字是" + num[i]);
        }
    }
}
