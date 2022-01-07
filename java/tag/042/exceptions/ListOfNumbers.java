import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;
    private Vector<Integer> victor;

    public ListOfNumbers() {
	victor = new Vector<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            victor.addElement(new Integer(i));
	this.readList("infile.txt");
	this.writeList();
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    public void readList(String filename) {
		String buffer;
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "r");
			while ((buffer = file.readLine()) != null ) {
				Integer i = new Integer(Integer.parseInt(buffer));
				System.out.println(i);
				victor.addElement(i);
			}
	        } catch(FileNotFoundException fnf) {
			System.err.println("File: " + filename + " not found.");
		} catch (IOException ioe) {
			System.err.println("Caught IOException: " + ioe.getMessage());
		}
	}
    public static void main(String[] args) {
	new ListOfNumbers();
}
