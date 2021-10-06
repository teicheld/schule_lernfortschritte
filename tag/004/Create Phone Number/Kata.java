public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        //get first 3 digits
        StringBuffer out = new StringBuffer();
        out.append("(");
        for (int i=0; i< 3; i++) {
            out.append(String.valueOf(numbers[i]));
        }
        out.append(") ");
        for (int i=3; i<6; i++) {
            out.append(String.valueOf(numbers[i]));
        }
        out.append("-");
        for (int i=6; i<numbers.length; i++) {
            out.append(String.valueOf(numbers[i]));
        }
        return out.toString();
    }
}