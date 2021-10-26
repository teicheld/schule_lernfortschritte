import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        //factor2square(a, b)
        Integer[] bUsed = new Integer[b.length];
        int iBu = 0;
        for (int i = 0; i < a.length; i++) {
            boolean same = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] * a[i] == b[j] && ! Arrays.asList(bUsed).contains(j)) {
                    same = true;
                    bUsed[iBu++] = j;
                    System.out.println(Arrays.asList(bUsed));
                    break;
                }
            }
            if (same == false)
                return false;
        }
        return true;
    }
    public static void main(String[] argv){
        int[] a = new int[]{0};
        int[] b = new int[]{0, 0, 0};
        System.out.println(comp(a, b));
    }
}