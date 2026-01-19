package appender;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Iteration {
public static void main(String args[]) throws FileNotFoundException, IOException {
	 Path filePath = Paths.get("J:/Kovan Labs/Performance/input_names1.txt");

     List<String> data = new ArrayList<>();

     try (BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()))) {
         String line;
         while ((line = br.readLine()) != null) {
             data.add(line);
         }
     }

     System.out.println("Total strings: " + data.size());

     
     long startFor = System.nanoTime();
     long countFor = 0;

     for (String s : data) {
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == 'a') {
                 countFor++;
             }
         }
     }
     
     long endFor = System.nanoTime();

  //stream
     long startStream = System.nanoTime();

     final long[] countStream = {0};   

     data.stream().forEach(s -> {
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == 'a') {
                 countStream[0]++;
             }
         }//for each process each element one by one and does not return anything.
     });

     long endStream = System.nanoTime();

    
     long forTime = (endFor - startFor) / 1000000;
    //ms to s = ms/1000
    
     long streamTime = (endStream - startStream) / 1000000;

     System.out.println("\nResults");
     System.out.println("-------");
     System.out.println("For-loop count for the character 'a' : " + countFor);
     System.out.println("Stream count for the character 'a'   : " + countStream[0]);

     System.out.println("\nPerformance");
     System.out.println("-----------");
     System.out.println("For-loop time for counting the character 'a': " + forTime + " ms");
     System.out.println("Stream time  for counting the character 'a' : " + streamTime + " ms");

     if (forTime < streamTime) {
         System.out.println("\nFor-loop is faster");
     } else {
         System.out.println("\nStream is faster");
     }
}
}
