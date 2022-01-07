public class Solution {
    public static boolean validParentheses(String parens)
    {
        boolean isValid = true;
        int open = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                open++;
            } else if (parens.charAt(i) == ')') {
                if (open > 0) {
                    open--;
                } else {
                    return false;
                }
            }
        }
        if (open == 0) {
            return true;
        } else {
            return false;
        }
    }
}
