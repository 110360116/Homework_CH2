public class Sample2_22 {
    public static void main(String[] args){
        int [][] num;
        num = new int[2][3];

        num[0][0] = 1989;
        num[0][1] = 13;
        num[0][2] = 22;
        num[1][0] = 3;
        num[1][1] = 14;
        num[1][2] = 30;

        for(int i = 0; i < num[1].length; i++){
            System.out.println("第" + (i+1) + "個數字是" + num[0][i] + " @TS");
            System.out.println("第" + (i+1) + "個數字是" + num[1][i] + " @SC");
        }
    }
}
