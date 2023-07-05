package plusMinus;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> integers) {
        // Write your code here
        boolean isArraySizeValid = integers.size() <= 100 && integers.size() > 0;
        if (!isArraySizeValid) {
            System.out.println("Invalid Array Size");
            return;
        }

        int size = integers.size();

        double positive = 0;
        double negative = 0;
        double zeros = 0;

        for (int integer: integers) {
            if (integer > 0) positive += 1;
            else if (integer < 0) negative += 1;
            else zeros += 1;
        }

        System.out.printf("%.6f %n", positive/size);
        System.out.printf("%.6f %n", negative/ size);
        System.out.printf("%.6f %n", zeros / size);

    }

}
