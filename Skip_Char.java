public class Skip_Char {
    public static void main(String[] args) {
        skip("", "baccdab");
        System.out.println(skip2("baccdab"));

    }

    static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        // Taking first character

        if (ch == 'a') {
            skip(processed, unprocessed.substring(1));
            // not including A in the processed string
        }

        else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }


    // Using a return statement
    static String skip2(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            return skip2(unprocessed.substring(1));
        }

        else {
            return ch + skip2(unprocessed.substring(1));
              
        }      
        
    }
    
}
