import java.util.StringTokenizer;

public class Kata {
    public static int findShort(String s) {
        int smallest = 999;
        StringTokenizer st = new StringTokenizer(s, " ", false);
        String word;
        int length;
        while (st.hasMoreTokens()) {
            length = st.nextToken().length();
            if (smallest > length)
                smallest = length;
        }
        return smallest;
    }
}