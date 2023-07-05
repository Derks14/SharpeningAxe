package miniMaxSum;

import java.io.*;
import java.math.*;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> numbers) {
        // Write your code here

        List<BigInteger> additions = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            BigInteger total = BigInteger.ZERO;
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j ) {
                    total = total.add(BigInteger.valueOf(numbers.get(j)));
                }
            }
            additions.add(total);
        }


        Collections.sort(additions);

        System.out.println(additions.get(0) + " " + additions.get(additions.size() -1 ));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
