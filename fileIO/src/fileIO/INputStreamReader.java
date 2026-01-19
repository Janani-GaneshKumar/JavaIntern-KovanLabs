package fileIO;
import java.io.*;
public class INputStreamReader {
public static void main(String args[]) throws IOException {
	
//Step 1: Read bytes from file using FileInputStream
FileInputStream fis = new FileInputStream("inputstreamreader.txt");

// Step 2: Convert bytes to characters using InputStreamReader
InputStreamReader isr = new InputStreamReader(fis);

// Step 3: Read characters one by one
int ch;
while ((ch = isr.read()) != -1) {
    System.out.print((char) ch);  // convert int to char
}

// Step 4: Close the reader
isr.close();}}