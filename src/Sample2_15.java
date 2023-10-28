public class Sample2_15 {
    public static void main(String[] args){
        int [] test = new int[4];
        test[0] = 13;
        test[1] = 23;
        test[2] = 30;
        test[3] = 1989;

        for(int i = 0; i < 4; i++){
            System.out.println("The " + (i+1) + "st/nd/rd/th person's score is " + test[i] + "!");
        }
    }
}
