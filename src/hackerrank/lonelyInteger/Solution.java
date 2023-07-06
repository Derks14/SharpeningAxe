package hackerrank.lonelyInteger;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyInteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int loneLyInteger(List<Integer> array) {
        // Write your code here
        List<Integer> storage = new ArrayList<>();

        for (int element: array) {

            int index = storage.indexOf(element);

            if (index == -1) {
                storage.add(element);
            } else {
                storage.remove(index);
            }
        }

        return storage.get(0);
    }

    public static int anotherLoneLyInteger(List<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            result = result ^ array.get(i);
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.loneLyInteger(a);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        bufferedReader.close();
    }
}
