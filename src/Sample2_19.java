public class Sample2_19 {
    public static void main(String[] args) {
        int[] test = {12, 13, 1989, 87};
        for(int i = 0; i < test.length; i++){
            System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
        }
        System.out.println("考試人數為" + test.length + "人");
    }
}
