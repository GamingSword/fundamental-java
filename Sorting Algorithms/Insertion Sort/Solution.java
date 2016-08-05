import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    System.out.print(Arrays.toString(sort(new int[]{3, 4, 1, 5, 11, 17, 7, 12, 2, 9})));
  }

  public static int[] sort(int[] array) {
    int temp;
    for (int i = 1; i < array.length; i++) {
      for (int j = i ; j > 0 ; j--) {
        if (array[j] < array[j-1]) {
          temp = array[j];
          array[j] = array[j-1];
          array[j-1] = temp;
        }
      }
    }
    return array;
  }
}
