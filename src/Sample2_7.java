import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7 {
    public static void main(String[] args)throws IOException{
        System.out.println("Are you a boy?");
        System.out.println("Please enter Y or N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

        if(letter == 'Y' || letter == 'y'){
            System.out.println("You're a boy!");
        }else if(letter == 'N' || letter == 'n'){
            System.out.println("You're a girl!");
        }else{
            System.out.println("Please enter Y or N");
        }
    }
}
