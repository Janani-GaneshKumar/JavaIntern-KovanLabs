package fileIOByteStream;
import java.io.*;
public class FILEOutputStream {
public static void main(String args[]) throws IOException{
	FileOutputStream  fos  = new FileOutputStream("fileoutputstream.txt");
	fos.write(65);
	byte[] data = "Hello World".getBytes();
    fos.write(data);
	fos.close();
}
}
