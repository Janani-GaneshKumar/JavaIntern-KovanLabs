package fileIO;
import java.io.*;
public class OUtputStreamWriter {
public static void main(String args[]) throws IOException {
	OutputStreamWriter osw = new OutputStreamWriter(
            new FileOutputStream("outputstreamwriter.txt"));

    char ch = 'A';       // your input character
    int ascii = (int) ch; // convert character to ASCII value

    osw.write(String.valueOf(ascii)); // write ASCII as text

    osw.close();

    System.out.println("Written ASCII value: " + ascii);
}
}
