package fileIOByteStream;
import java.io.*;
public class INputStream {
public static void main(String args[]) throws IOException {
	InputStream is = new FileInputStream("inputstream.txt");
	BufferedInputStream bis = new BufferedInputStream(is);
	//fileinputstream does not support mark() and reset() so have to pass the object to BufferedInputStream.
	
	
	// 1️.markSupported()-checks if mark() is supported or not.
    System.out.println("Is mark supported?: " + bis.markSupported());

    // 2️.read()-reads the bytes one by one.
    System.out.println("First Character: " + (char) bis.read());

    // 3️.mark()-marks the current position and has readlimit that bytes can be read before mark becomes invalid.
    bis.mark(10);
    System.out.println("Stream marked");

    // 4️.read(byte[])-stores the bytes in byte array and reads it one by one from the array,
    byte[] arr = new byte[3];
    bis.read(arr);
    System.out.println("read[arr]: " + new String(arr));

    // 5️.reset()-move stream back to last marked position.
    bis.reset();
    System.out.println("After reset: " + (char) bis.read());

    // 6️.skip()- skip n elements.
    bis.skip(2);
    System.out.println("After skip: " + (char) bis.read());

    // 7️.close() - close the stream
    bis.close();
    System.out.println("Stream closed");
	
    //streams should be closed to avoid unnecessary memory space holding.
    //close() release the resources in the memory.
}
}
