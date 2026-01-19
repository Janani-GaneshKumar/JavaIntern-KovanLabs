package fileIO;
import java.io.*;
public class Methods_In_FileReader {
	public static void main(String args[]) throws IOException {
	FileReader fr = new FileReader("sample.txt");
    System.out.println("\nOutput-1\n ");
	FileReader fr1 = new FileReader("sample.txt");
	int ch = fr1.read();//this reads character one bye one
	while (ch != -1) {
	    System.out.print((char) ch);
	    ch = fr1.read();
	}
	
	System.out.println("\nOutput-2\n ");
	char[] buffer = new char[20];
	int count = fr.read(buffer); 

	System.out.println("Characters read: " + count);
	System.out.println(new String(buffer));

    System.out.println("\nOutput-3");
    fr1.skip(5); // skip first 5 characters

    int c1 = fr1.read();
    System.out.println("Character after skipping: " + (char) c1);
    
    
    System.out.println("\nOutput-4\n");
    
    FileReader r = new FileReader("sample.txt");
        int c=r.read();
    if (r.ready()) {
        System.out.println("File is ready to read.");
        
        while (c != -1) {
    	    System.out.print((char) c);
    	    c = r.read();
    	}
        
    } else {
        System.out.println("File is not ready.");
    }
}
}