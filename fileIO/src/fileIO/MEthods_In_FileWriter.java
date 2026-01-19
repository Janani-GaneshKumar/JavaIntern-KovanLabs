package fileIO;
import java.io.*;
public class MEthods_In_FileWriter {
public static void main(String args[]) throws IOException {
	FileWriter fw = new FileWriter("filewriter.txt");
	fw.write(65);//1.Writes a single Character
	fw.write("\n");
	char data[]= {'H','E','L','L','O'};
	fw.write(data);//2.writes a character arrays
	fw.write("\n");
	fw.write("Hii Janani");//3.writes a string
	fw.write("\n");
	String e ="Hello Janani How Are You?";
	fw.write(e,6 ,12);//4.writes a length of the string
	fw.write("\n");
	fw.write("\n");
	
	fw.flush();//5.writes if any data present in the buffer to file
	 fw.close();
}
}
