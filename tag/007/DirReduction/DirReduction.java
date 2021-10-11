import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> easyPath = new ArrayList<String>();
        String last = null;
        for (int i = 0; i< arr.length; i++) {
            if (easyPath.size() == 0) {
                easyPath.add(arr[i]);
            } else {
                last = easyPath.get(easyPath.size() - 1);
                if (is_valid(last, arr[i])) {
                    easyPath.add(arr[i]);
                } else {
                    easyPath.remove(easyPath.size() - 1);
                }
            }
        }
        return easyPath.toArray(new String[easyPath.size()]);
    }
    public static boolean is_valid(String last, String current){
        if (!(last == "NORTH" && current == "SOUTH" || last == "SOUTH" && current == "NORTH" || last == "EAST" && current == "WEST" || last == "WEST" && current == "EAST")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] argv) {
        System.out.println(Arrays.toString(dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
    }
}