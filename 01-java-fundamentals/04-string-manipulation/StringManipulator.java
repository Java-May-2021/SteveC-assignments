public class StringManipulator {
    public String trimAndConcat(String one, String two) {
        one = one.trim();
        two = two.trim();
        return one.concat(two);
    }

    public Integer getIndexOrNull(String three, char one) {

        int a = three.indexOf(one);
        if (a == -1) {
            return null;

        } else {
            return a;
        }

    }
    public Integer getIndexOrNull(String four , String five) {
        int a = four.indexOf(five);
       
        if (a == -1) {
            return null;

        } else {
            return a;
        }
        
        
    }
    String concatSubstring(String word, int a, int b, String subString){
        String newString = word.substring(a, b);
        return newString.concat(subString);


    }
}
