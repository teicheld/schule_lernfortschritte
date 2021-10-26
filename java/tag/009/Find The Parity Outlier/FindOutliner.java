public class FindOutliner {
    static int find(int[] integers){
        int even    = 0;
        int odd     = 0;
        int lastEven = 0;
        int lastOdd = 0;
        for (int x : integers) {
            if (x % 2 == 0){
                even++;
                lastEven = x;
            } else {
                odd++;
                lastOdd = x;
            }
        }
        if (even < odd) {
            return lastEven;
        } else {
            return lastOdd;
        }
    }
    public static void main(String[] argv) {
        System.out.println(find(new int[] {1, 1, 1, 2}));
    }
}
