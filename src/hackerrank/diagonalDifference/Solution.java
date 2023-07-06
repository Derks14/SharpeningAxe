package hackerrank.diagonalDifference;

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

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        // create a double for loop through to run through the matrix
        // add instances where

        int ltr = 0;
        int rtl = 0;
        int highestIndex = arr.size() - 1;

        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() ; j++) {
                if (i==j){
                    ltr += arr.get(i).get(j);
                }
                int currentHighestIndex = j + i;
                if (currentHighestIndex == highestIndex) {
                    rtl += arr.get(i).get(j);
                }
            }
        }
        return  Math.abs(ltr - rtl);
    }

    public static int diagonalDifference2(List<List<Integer>> arr) {
        // Write your code here
        // create a double for loop through to run through the matrix
        // add instances where

        int leftToRight = 0;
        int rightToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(arr.size() - i -  1);
        }

        return Math.abs(leftToRight - rightToLeft);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
