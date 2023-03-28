public class Subsequences {
    public static void main(String[] args) {
        subsequences("", "abc");
        
    }

    static void subsequences(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subsequences(processed + ch, unprocessed.substring(1));
        subsequences(processed, unprocessed.substring(1));

        // Taking 2 recursion calls:
        /*One for including in the first element
          Another one for excluding out the first element
         */
    }
    
}
