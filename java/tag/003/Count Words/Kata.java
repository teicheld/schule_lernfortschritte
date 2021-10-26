import java.nio.charset.StandardCharsets;
public class Kata {
    public static int CountWords(String s) {
        int words = 0;
        int i = 0;
        while (i < s.length()) {
            i = skip_whitespaces(s, i);
            if (i < s.length())
                words++;
            i = skip_word(s, i);
        }
        return words;
    }

    public static int skip_whitespaces(String s, int i) {
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        return i;
    }
    public static int skip_word(String s, int i) {
        while (i < s.length() && s.charAt(i) != ' ')
            i++;
        return i;
    }
}
