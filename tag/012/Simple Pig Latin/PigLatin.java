import java.util.StringTokenizer;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder strB = new StringBuilder();
        StringTokenizer strTokens = new StringTokenizer(str, " ", false);
        while (strTokens.hasMoreTokens()) {
            String word = strTokens.nextToken();
            if (Character.isLetterOrDigit(word.charAt(0))) {
                strB.append(word.substring(1,word.length()) + word.charAt(0) + "ay ");
            } else {
                strB.append(word + " ");
            }
        }
        String strFinal = strB.toString();
        strFinal = strFinal.substring(0,strFinal.length()-1);
        return strFinal;
    }
    public static void main(String[] argv){
        System.out.println(pigIt("Pig    latin is cool"));
    }
}
