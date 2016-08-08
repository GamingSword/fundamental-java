import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(sort(new int[] {3, 1, 12, 14})));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = i;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    key = j;
                    min = array[j];
                }
            }
            array[key] = array[i];
            array[i] = min;
        }
        return array;
    }
}
