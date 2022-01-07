import java.util.Arrays;

public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        for (int[] row : pyramid) {
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
               if (j==0 && i > 0) {
                   pyramid[i][j] += pyramid[i-1][j];
               } else if (j > 0 && i > 0 && j < pyramid[i].length - 1) {
                   if (pyramid[i-1][j-1] > pyramid[i-1][j])
                       pyramid[i][j] += pyramid[i-1][j-1];
                   else
                       pyramid[i][j] += pyramid[i-1][j];
               } else if (j > 0 && i > 0 && j == pyramid[i].length - 1) {
                   pyramid[i][j] += pyramid[i-1][j-1];
               }
            }
        }
        int highest = 0;
        for (int sum : pyramid[pyramid.length - 1]) {
            if (sum > highest)
                highest = sum;
        }
        return highest;
    }
    public static void main(String[] argv) {
        System.out.println(longestSlideDown(new int[][]{
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        }));
    }
}
