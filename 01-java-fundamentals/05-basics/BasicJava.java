import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void printOne() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);

        }

    }

    public void printOdd() {
        for (int i = 1; i < 256; i += 2) {

            System.out.println(i);
        }

    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {

            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);

        }

    }

    public void printArray() {
        int[] x = { 4, 8, 8, 5, 9 };
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }

    }

    public Integer findMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

        }
        return maxNum;

    }

    public double findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        return (sum / (arr.length));

    }

    public ArrayList<Integer> oddArray() {

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256; i += 2) {

            myArray.add(i);
        }
        return myArray;

    }

    public int biggerThan(int[] arr) {
        int x = 0;
        int y = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {

                x += 1;

            }

        }
        return x;

    }

    public int[] squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];

        }
        return arr;

    }

    public int[] noNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;

            }

        }
        return arr;

    }

    public int findMin(int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < minNum)
                minNum = val;
        }
        return minNum;

    }

    public ArrayList<Object> minMaxAvg(int[] arr) {
        ArrayList<Object> myArray = new ArrayList<Object>();
        int max = findMax(arr);
        int min = findMin(arr);
        double avg = findAvg(arr);
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);
        return myArray;

    }

    public int[] switchArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

}
