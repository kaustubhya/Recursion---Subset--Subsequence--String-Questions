public class Ascii {
    public static void main(String[] args) {
        subsequenceAscii("", "abc");
    }

    static void subsequenceAscii(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subsequenceAscii(processed + ch, unprocessed.substring(1));
        subsequenceAscii(processed, unprocessed.substring(1));
        subsequenceAscii(processed + (ch + 0), unprocessed.substring(1));
    }
    
}
