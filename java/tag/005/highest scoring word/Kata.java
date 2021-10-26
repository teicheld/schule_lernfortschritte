public class Kata {
    public static String high(String s) {
        String[] words = s.split(" ");
        int[] score = new int[words.length];
        int iWord = 0;
        int iHighest = 0;
        int highest = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                score[iWord] += word.charAt(i) - 'a' + 1;
            }
            iWord++;
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > highest) {
                highest = score[i];
                iHighest = i;
            }
        }
        return words[iHighest];
    }
    public static void main(String[] argv) {
        System.out.println(high("a b aaa asdf fjjjjjjjjjjjjjjj zzzzzzz"));
    }
}