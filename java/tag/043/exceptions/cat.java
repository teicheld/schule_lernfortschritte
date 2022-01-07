import java.io.*;

public class cat{
public static void cat(File file) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
	    System.err.println(e.getMessage());
    } catch (IOException e) {
	    System.err.println(e.getMessage());
    }
}
}
