package fileIOByteStream;
import java.io.*;
public class PRintStream {
public static void main(String args[]) throws FileNotFoundException {
	PrintStream ps = new PrintStream("J:\\Kovan Labs\\ByteStream\\printstream.txt");

    // print()
    ps.print("Java ");
    ps.print(2025);

    // println()
    ps.println();
    ps.println("PrintStream Demo");

    // append()
    ps.append('A');
    ps.append("BCDE", 1, 4); // BCD

    // format()
    ps.format("\nMarks: %d, Grade: %c", 90, 'A');

    // flush()
    ps.flush();

    // checkError()
    System.out.println("Error occurred? " + ps.checkError());

    // close()
    ps.close();
}
}
