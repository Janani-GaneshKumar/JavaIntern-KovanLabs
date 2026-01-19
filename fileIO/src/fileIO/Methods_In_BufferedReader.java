package fileIO;
import java.io.*;
public class Methods_In_BufferedReader {
public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("sample2.txt"));
    /*System.out.println("Output:1\n");
	char[] arr = new char[20];
	br.read(arr, 0, 5); // Stores 5 characters starting at index 2
	System.out.println(arr); */
	
	/*System.out.println("Output:2\n");
	String line=br.readLine();
	System.out.println(line);*/
	
	/*System.out.println("Output:3\n");
	br.skip(5);
	char ch = (char) br.read();
	System.out.println((char)ch);*/
	
	System.out.println("Output:4\n");
	br.mark(100);//mark current position
	System.out.println(br.readLine()); 
	
	br.reset();//go back to mark
	System.out.println(br.readLine());
	
	br.close();//it is used to close the bufferedreader 

}
}
