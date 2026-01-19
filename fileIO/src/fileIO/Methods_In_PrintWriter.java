package fileIO;
import java.io.*;
public class Methods_In_PrintWriter {
public static void main(String args[]) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("printwriter.txt");
	pw.print("Hello"); // no new line
    pw.println(" World");// with new line
    pw.println(100);// prints number on new line
    pw.printf("Value: %.2f", 12.3456);// formatted output
    pw.flush();// forces writing
    pw.close();// closes the writer
}
}
