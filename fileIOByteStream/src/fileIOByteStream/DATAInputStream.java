package fileIOByteStream;
import java.io.*;
public class DATAInputStream {
	public static void main(String args[]) throws IOException{
	 DataInputStream dis =
	            new DataInputStream(new FileInputStream("J:\\Kovan Labs\\ByteStream\\dataoutput.txt"));

	        System.out.println(dis.readInt());
	        System.out.println(dis.readFloat());
	        System.out.println(dis.readBoolean());
	        System.out.println(dis.readUTF());

	        dis.close();

}
}