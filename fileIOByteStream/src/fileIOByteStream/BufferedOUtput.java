package fileIOByteStream;
import java.io.*;
public class BufferedOUtput {
	public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("J:\\Kovan Labs\\ByteStream\\Bufferedoutput.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String data = "BufferedOutputStream Example";

            // 1. write()
            bos.write(data.getBytes());

            // 2. flush()
            bos.flush();

            // 3. close()
            bos.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }}
}
