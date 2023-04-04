import java.util.ArrayList;

public class Ascii_List {
    public static void main(String[] args) {
        System.out.println(subsequenceAsciiList("", "abc"));
        
    }
    
    static ArrayList<String> subsequenceAsciiList (String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList <>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> first = subsequenceAsciiList(processed + ch, unprocessed.substring(1));
        ArrayList<String> second = subsequenceAsciiList(processed, unprocessed.substring(1));
        ArrayList<String> third = subsequenceAsciiList(processed + (ch + 0), unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
