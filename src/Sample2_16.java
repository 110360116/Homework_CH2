import java.lang.reflect.Array;

public class Sample2_16 {
    public static void main(String[] args){
        int[] intArray = (int[]) Array.newInstance(int.class, 3);
        Array.set(intArray, 0, 13);
        Array.set(intArray, 1, 1989);
        Array.set(intArray, 2, 12);

        System.out.println("intArray[0] = " + Array.get(intArray, 0));
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));
    }
}
