package appender;

import java.io.*;

public class StringWriter {
    public static void main(String[] args) {
        String inputFile = "J:/Kovan Labs/StringInJava/main.txt";
        String counterFile = "J:/Kovan Labs/StringInJava/counter.txt";
        String dirPath = "J:/Kovan Labs/StringInJava/";
        int batchSize = 100;

        File dir = new File(dirPath);
        if (!dir.exists()) dir.mkdirs();

        int startIndex = 0;

        // Read counter file (byte stream)
        File counter = new File(counterFile);
        if (counter.exists()) {
            try (FileInputStream fis = new FileInputStream(counter)) {
                StringBuilder sb = new StringBuilder();
                int ch;
                while ((ch = fis.read()) != -1) {
                    sb.append((char) ch);
                }
                if (sb.length() > 0) {
                    startIndex = Integer.parseInt(sb.toString().trim());
                }
            } catch (Exception e) {
                System.out.println("Invalid counter file. Resetting counter.");
                startIndex = 0;
            }
        }

        int writtenCount = 0;
        int currentLine = 0;
        String outputFile =
                dirPath + "batch_" + (startIndex / batchSize + 1) + ".txt";
        try (
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(inputFile));
            FileOutputStream fos =
                    new FileOutputStream(outputFile)
        ) {

   /*ByteArrayOutputStream is a class from java.io used to write data into a byte array in memory, 
        	instead of writing it to a file or network.
        	It collects output data in RAM as bytes.*/
            ByteArrayOutputStream lineBuffer = new ByteArrayOutputStream();
            int b;

            while ((b = bis.read()) != -1) {

                // Line break detected
                if (b == '\n') {

                    if (currentLine >= startIndex &&
                        writtenCount < batchSize) {

                        fos.write(lineBuffer.toByteArray());
                        fos.write('\n');
                        writtenCount++;
                    }

                    lineBuffer.reset();
                    currentLine++;

                    if (writtenCount == batchSize) {
                        break;
                    }

                } else if (b != '\r') {
                    lineBuffer.write(b);
                }
            }

            // Handle last line (no newline at EOF)
            if (lineBuffer.size() > 0 &&
                currentLine >= startIndex &&
                writtenCount < batchSize) {

                fos.write(lineBuffer.toByteArray());
                fos.write('\n');
                writtenCount++;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Update counter file (byte stream)
        try (FileOutputStream fos = new FileOutputStream(counterFile)) {
            fos.write(String.valueOf(startIndex + writtenCount).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (writtenCount == 0) {
            System.out.println("All lines are processed.");
        } else {
            System.out.println("Written " + writtenCount +
                    " lines starting from index " + startIndex +
                    " into " + outputFile);
        }
    }
}
