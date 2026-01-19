package fileIOByteStream;

import java.io.IOException;
import java.io.*;
public class BufferedINput {
	 public static void main(String[] args) {

	        try {
	            FileInputStream fis = new FileInputStream("J:\\Kovan Labs\\ByteStream\\bufferedinput.txt");
	            BufferedInputStream bis = new BufferedInputStream(fis);

	            // 1. available()
	            System.out.println("Bytes available: " + bis.available());

	            // 2. mark()
	            bis.mark(10);

	            // 3. read() - read first 5 bytes
	            System.out.print("First 5 bytes: ");
	            for (int i = 0; i < 5; i++) {
	                System.out.print((char) bis.read());
	            }

	            // 4. reset()
	            bis.reset();
	            System.out.print("\nAfter reset (again 5 bytes): ");
	            for (int i = 0; i < 5; i++) {
	                System.out.print((char) bis.read());
	            }

	            // 5. close()
	            bis.close();

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
}
}