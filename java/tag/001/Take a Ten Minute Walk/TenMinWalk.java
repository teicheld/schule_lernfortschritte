public class TenMinWalk {
  public static boolean isValid(char[] walk) {
        int walkPos = 0;
        int x = 0;
        int y = 0;
        int timeLeft = 10;
        while ( walkPos < walk.length) {
            switch (walk[walkPos]) {
                case 'n': y++;
                break;
                case 'w': x--;
                break;
                case 's': y--;
                break;
                case 'e': x++;
                break;
            }
            timeLeft--;
            walkPos++;
       }
       return x == 0 && y == 0 && timeLeft == 0;
  }
}