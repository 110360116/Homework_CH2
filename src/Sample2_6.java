import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_6 {
    public static void main(String[] args)throws IOException{
        System.out.println("Please input a or b");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

        switch(letter){
            case 'a':{
                System.out.println("Inputted is a");
                break;
            }
            case 'b':{
                System.out.println("Inputted is b");
                break;
            }
            default:{
                System.out.println("Please input a or b");
                break;
            }
        }
    }
}
