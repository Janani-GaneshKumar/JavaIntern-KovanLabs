package appender;
import java.io.*;
import java.time.LocalDate;
public class DailyAppender {
	
	private static final String BASE_PATH = "J:/Kovan Labs/DailyAppender/";

	public static void main(String[] args) {

	try {
	            String today = LocalDate.now().toString();
	            File file = new File(BASE_PATH + today + ".txt");

	            int lastNumber = getLastNumber(file);

	            writeNext10(file, lastNumber);

	            System.out.println("Written: " + (lastNumber + 1) + " to " + (lastNumber + 10));} 

	        catch (Exception e) {
	            e.printStackTrace();}}

	private static int getLastNumber(File file) throws IOException {
	        if (!file.exists()) return 0;

	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line;
	        int last = 0;

	        while ((line = br.readLine()) != null) {
	            try {
	                last = Integer.parseInt(line.trim());
	            } catch (NumberFormatException e) {
	            	System.out.println("The String is not converted into an Integer");
	            }
	        }
	        br.close();
	        return last; }

	 private static void writeNext10(File file, int lastNumber) throws IOException {
	        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
	        for (int i = lastNumber + 1; i <= lastNumber + 10; i++) {
	            pw.println(i);
	        }
	        pw.close(); }
	}


