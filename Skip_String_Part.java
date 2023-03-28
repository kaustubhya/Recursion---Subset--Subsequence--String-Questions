public class Skip_String_Part {
    public static void main(String[] args) {
        String ans = skipAppNotApple("bcdapplolat");
        System.out.println(ans);
        
    }

    static String skipAppNotApple(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return "";
        }

        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
            return skipAppNotApple(unprocessed.substring(3));
            // Skip App when there's no Apple
        }

        else {
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
   }
    
}
