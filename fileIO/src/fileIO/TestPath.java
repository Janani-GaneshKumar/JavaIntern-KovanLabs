package fileIO;
import java.io.*;
import java.util.*;


public class TestPath {
    public static void main(String[] args) {

    	// Folder containing input file
        String folderPath = "J:/Kovan Labs/Append";          
        String inputFile  = folderPath + File.separator + "input.txt";  // Use File.separator for OS-independent paths

        try {
            // Read all lines from the main file
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

                int end = Math.min(start + chunkSize, total);  // last chunk may have <100 lines
                String outputFile = folderPath + File.separator + "part" + fileCount + ".txt";

                writeToFile(lines, start, end, outputFile);
                fileCount++;
            }

            System.out.println("Files created successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(List<String> lines, int start, int end, String filePath) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

        for (int i = start; i < end; i++) {
            bw.write(lines.get(i));
            bw.newLine();
        }
        bw.close();
    }
    }

