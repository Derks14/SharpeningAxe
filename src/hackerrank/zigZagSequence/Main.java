package hackerrank.zigZagSequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // input looks like
    // 1
    // 7
    // 1 2 3 4 5 6 7

    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            // findZigZagSequence(a, n);

            zigZagSequence(a, n);
        }
    }
    public static void findZigZagSequence(int [] a, int n){
        // take the swap mid with last value
        // then increment mid index and decrement last index till they are both equal
        Arrays.sort(a);
        int mid = (n )/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void zigZagSequence(int [] array, int size) {
        Arrays.sort(array);
        int startIndex = size / 2;
        int descendingIndex = size - 1;
        while (startIndex <= descendingIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[descendingIndex];
            array[descendingIndex] = temp;
            startIndex += 1;
            descendingIndex -= 1;
        }

        // for(int i = 0; i < size; i++){
        //     if(i > 0) System.out.print(" ");
        //     System.out.print(array[i]);
        // }
        System.out.println(List.of(array));


    }
}

