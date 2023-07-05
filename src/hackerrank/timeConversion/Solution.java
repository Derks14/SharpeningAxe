package hackerrank.timeConversion;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'hackerRank.timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        boolean isAm = s.contains("AM");
        boolean isPm = s.contains("PM");
        s = s.replace("AM", "");
        s = s.replace("PM", "");
        List<String> values = Arrays.asList(s.split(":"));

        boolean isMidnight = isAm && Objects.equals(values.get(0), "12");
        boolean isNoon = isPm && Objects.equals(values.get(0), "12");

        String hours = null;
        if (isMidnight) {
            hours = "00";
        } else if (isNoon) {
            hours = values.get(0);
        } else if (isPm) {
            hours = String.valueOf(Integer.parseInt(values.get(0)) + 12);
        } else {
            hours = values.get(0);
        }

        values.set(0, hours);

        return String.join(":", values);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
