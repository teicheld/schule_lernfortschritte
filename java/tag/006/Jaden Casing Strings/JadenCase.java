import java.util.StringTokenizer;

public class JadenCase {
    public String toJadenCase(String phrase) {
        StringTokenizer st = new StringTokenizer(phrase, " ", true);
        String capitalizedString = new String();
        String nextWord;
        while (st.hasMoreTokens()) {
            nextWord = st.nextToken();
            capitalizedString += nextWord.substring(0,1).toUpperCase() + nextWord.substring(1);
        }
        if ( capitalizedString == "" )
            return null;
        else
            return capitalizedString;
    }
}
