public class Sample2_17 {
    public static void main(String[] args){
        int[] test;
        test = new int[4];
        test[0] = 12;
        test[1] = 13;
        test[2] = 1989;
        test[3] = 87;

        test[7] = 9891;

        for(int i = 0; i < 4; i++){
            System.out.println("The " + (i+1) + "th person's score is " + test[i]);
        }
    }
}
