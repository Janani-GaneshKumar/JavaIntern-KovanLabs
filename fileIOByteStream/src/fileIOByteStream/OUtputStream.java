package fileIOByteStream;
import java.io.*;
public class OUtputStream {
	public static void main(String args[]) throws IOException{
		 FileOutputStream fos = new FileOutputStream("J:\\Kovan Labs\\ByteStream\\outputstream.txt");

	        // 1️.write(int b)
	        fos.write('J');

	        // 2️.write(byte[] b)
	        byte[] data = "AVA PROGRAM".getBytes();//getBytes() converts characters or strings into bytes
	        fos.write(data);

	        // 3️.write(byte[] b, int off, int len)
	        fos.write(data, 0, 3);   // writes "AVA"

	        // 4️.flush()
	        fos.flush();
	        System.out.println("Data flushed to file");

	        // 5️.close()
	        fos.close();
	        System.out.println("Stream closed");
	        

	}

}
