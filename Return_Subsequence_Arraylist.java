import java.util.ArrayList;

public class Return_Subsequence_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> subsequenceListReturn = subsequeneReturnList("", "abc");
        System.out.println(subsequenceListReturn);
        
    }
    
    static ArrayList<String> subsequeneReturnList (String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subsequeneReturnList(processed + ch, unprocessed.substring(1));
        ArrayList<String> right = subsequeneReturnList(processed, unprocessed.substring(1));


        left.addAll(right);
        // or right.addAll(left)
        // Adding left and right subarrays

        return left;
        // After returning all the elements, we'll be left with only one element,
        //  then that code will go to isEmpty base condition
    }
}
