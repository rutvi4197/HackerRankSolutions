import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int visuallyBalancedSections(List<Integer> colors) {
        int count = 0;
        int n = colors.size();
        
        for (int i = 0; i < n; i++){
            
            int[] colorTypes = new int[51];
            int number = 0;
            
            for (int j = i; j < n; j++){
                
                colorTypes[colors.get(j)]++;
                
                if (colorTypes[colors.get(j)] % 2 == 0){
                    number--;
                }
                else{
                    number++;
                }
                
                if (number == 1 || number == 0){
                    count++;
                }
            }
        }
        return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> colors = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.visuallyBalancedSections(colors);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
