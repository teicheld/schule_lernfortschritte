public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int twentyfive = 0;
        int fifty = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            int bill = peopleInLine[i];
            switch (bill) {
                case 25: twentyfive++;
                    break;
                case 50:
                    if ( twentyfive > 0 ) {
                        twentyfive--;
                        fifty++;
                    } else {
                        return "NO";
                    }
                    break;
                case 100:
                    if ( fifty > 0 && twentyfive > 0 ) {
                        fifty--;
                        twentyfive--;
                    } else if ( twentyfive >= 3 ) {
                            twentyfive -= 3;
                    } else {
                        return "NO";
                    }
                    break;
                default: System.out.println("invalid bill:" + bill);
                    return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] argv) {
        System.out.println(Tickets(new int[] {25, 25, 25, 100}));
    }
}
