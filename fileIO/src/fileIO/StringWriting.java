package fileIO;
import java.io.*;
import java.util.*;
public class StringWriting {
	public static void main(String args[]) {
	String folderPath = "J:/Kovan Labs/Append";          
    String inputFile  = folderPath + "input.txt";   // your main file with 356 lines

    try {
        // Read all the lines from main file
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        int total = lines.size();
        int chunkSize = 100;
        int fileCount = 1;

        // Loop and create output files for each 100 lines
        for (int start = 0; start < total; start += chunkSize) {

            int end = Math.min(start + chunkSize, total);  // last chunk may be <100

            String outputFile = folderPath + "part" + fileCount + ".txt";
            writeToFile(lines, start, end, outputFile);

            fileCount++;
        }

        System.out.println("Files created successfully!");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

private static void writeToFile(List<String> lines, int start, int end, String filePath) throws IOException {

    BufferedWriter bw = new BufferedWriter(new FileWriter(filePath)); // creates file automatically

    for (int i = start; i < end; i++) {
        bw.write(lines.get(i));
        bw.newLine();
    }
    bw.close();
}
}