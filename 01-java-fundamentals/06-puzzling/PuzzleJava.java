import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        int[] list = { 3, 5, 9, 20, 60, 90 };

        puzzleOne(list);
        puzzleTwo();
        letters();
        randomTen();
        sort();
        stringTen();

    }

    public static ArrayList<Integer> puzzleOne(int[] arr) {
        int sum = 0;
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                myArray.add(arr[i]);

            }

        }
        System.out.println(sum);
        return myArray;

    }

    public static ArrayList<String> puzzleTwo() {
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Nancy");
        myArray.add("Jinichi");
        myArray.add("Fujibayashi");
        myArray.add("Momochi");
        myArray.add("Ishikawa");

        Collections.shuffle(myArray);
        System.out.println(myArray);
        return myArray;

    }

    public static void letters() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char letter = 'a'; letter <= 'z'; ++letter) {
            alphabet.add(letter);

        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(25));
        System.out.println(alphabet.get(0));
        char firstLetter = alphabet.get(0);
        for (int i = 0; i < vowels.length; i++) {

            if (firstLetter == (vowels[i])) {
                System.out.println("First letter is a vowel");

            }

        }

    }

    public static void randomTen() {
        Random r = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomNum = 55 + r.nextInt(101 - 55);
            myArray.add(randomNum);

        }
        System.out.println(myArray);

    }

    public static void sort() {
        Random r = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomNum = 55 + r.nextInt(101 - 55);
            myArray.add(randomNum);

        }
        Collections.sort(myArray);
        System.out.println(myArray);
        int min = myArray.get(0);
        int max = myArray.get(9);

        System.out.println("Min: " + min + " Max: " + max);

    }

    public static String randomString() {
        Random r = new Random();
        String letters = "abcdefgHIJKLnmopQrstuvwxyZ";
        String randomString = "";
        int len = 5;
        char[] list = new char[5];

        for (int i = 0; i < len; i++) {
            list[i] = letters.charAt(r.nextInt(letters.length()));

        }
        for (int i = 0; i < list.length; i++) {

            randomString += list[i];

        }

        
        return randomString;

    }
    public static void stringTen() {
        ArrayList<String> myArray = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            myArray.add(randomString());


        }
        System.out.println(myArray);



    }

}
