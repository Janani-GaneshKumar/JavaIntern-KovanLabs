package appender;
import java.nio.file.*;
//Imports NIO file APIs (Path, Paths, Files)
//Imports classes related to modern file handling.
import java.util.*;
import java.util.stream.*;

public class IterationPerformanceTest {

    public static void main(String[] args) throws Exception {
    	 
    	Path filePath = Paths.get("J:/Kovan Labs/Performance/input_names1.txt");

        List<String> data =  new ArrayList<String>();
        		
        Files.readAllLines(filePath);

        System.out.println("Total strings: " + data.size());
        
        
        //FOR LOOP
        long startFor = System.nanoTime();
        //return types of nanoTime() is long.
        long countFor = 0;
        for (String s : data) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    countFor++;
                }
            }
        }
        long endFor = System.nanoTime();
        //STREAM
        long startStream = System.nanoTime();

        long countStream =
                data.stream()
                    .flatMapToInt(String::chars)
                    .filter(c -> c == 'a')
                    .count();

        long endStream = System.nanoTime();

        //RESULTS
        long forTime =( endFor - startFor)/1000000;
        long streamTime = (endStream - startStream)/1000000;

        System.out.println("\nResults");
        System.out.println("-------");
        System.out.println("For-loop count   : " + countFor);
        System.out.println("Stream count     : " + countStream);

        System.out.println("\nPerformance");
        System.out.println("-----------");
        System.out.println("For-loop time   : " + forTime + " ms");
        System.out.println("Stream time     : " + streamTime + " ms");

        if (forTime < streamTime) {
            System.out.println("\nFor-loop is faster");
        } else {
            System.out.println("\nStream is faster");
        }
    }
}