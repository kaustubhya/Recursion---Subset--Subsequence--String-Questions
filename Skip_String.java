public class Skip_String {
    public static void main(String[] args) {
        System.out.println(skipApple("baccdappleab"));
        
    }

    static String skipApple(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("apple")) {
            return skipApple(unprocessed.substring(5));
            // skips the string apple whose length is equal to 5
        }

        else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
    
}
