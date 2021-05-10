import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        int[] list = { 4, 5, 90, -2, 34, -50 };
        BasicJava result = new BasicJava();
        result.printOne();
        result.printOdd();
        result.printSum();
        result.printArray();
        System.out.println(result.findMax(list));
        System.out.println(result.findAvg(list));
        System.out.println(result.oddArray());
        System.out.println(result.biggerThan(list));
        System.out.println(Arrays.toString(result.squareArray(list)));
        System.out.println(Arrays.toString(result.noNegative(list)));
        System.out.println(result.minMaxAvg(list));
        System.out.println(Arrays.toString(result.switchArray(list)));

    }

}
