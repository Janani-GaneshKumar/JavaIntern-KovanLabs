package fileIOByteStream;
import java.io.*;

public class FIleInputStream {
    public static void main(String[] args) {
    	 String fileName = "J:\\Kovan Labs\\ByteStream\\fileinput.txt";

         try (FileInputStream fis = new FileInputStream(fileName)) {
        	 //1.read() reads bytes one by one.
           int ch= fis.read();
            System.out.println("First letter: "+(char)ch);
            //2.checks how many bytes available.
            System.out.println(fis.available());
            //3.skip() sking n bytes.
            fis.skip(2);
            //4.getFD()-returns file descriptor
            //descriptor is unique ID used by OS to represent the open filee.
            System.out.println(fis.getFD());
            
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}