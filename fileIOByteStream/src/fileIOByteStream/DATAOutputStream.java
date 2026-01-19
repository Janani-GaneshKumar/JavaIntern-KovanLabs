package fileIOByteStream;
import java.io.*;
public class DATAOutputStream {
public static void main(String args[]) throws IOException
{
  DataOutputStream dos =
	            new DataOutputStream(new FileOutputStream("J:\\Kovan Labs\\ByteStream\\dataoutput.txt"));
	        dos.writeInt(10);
	        dos.writeFloat(3.14f);
	        dos.writeBoolean(true);
	        dos.writeUTF("Java");
	        dos.close();

 
}
}
