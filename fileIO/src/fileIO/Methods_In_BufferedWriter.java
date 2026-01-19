package fileIO;
import java.io.*;
public class Methods_In_BufferedWriter{
public static void main(String args[]) throws IOException {
	BufferedWriter writer = new BufferedWriter(new FileWriter("sample3.txt"));
	writer.write("Line 1");
	writer.newLine();  // moves to next line
	writer.write("Line 2");
	writer.newLine();
	char[] letters = {'H','e','l','l','o',' ','W','o','r','l','d'};
	writer.write(letters, 0, 5);
	writer.flush();
	writer.close();
}
}
