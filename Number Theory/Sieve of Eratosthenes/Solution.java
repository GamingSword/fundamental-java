import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(prime(30)));
    System.out.print(count(prime(30)));
  }

  public static int[] prime(int input) {
    int[] array = new int[input - 1];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 2;
    }
    for (int m = 2; m <= input; m++) {
      for (int i = 2; i * m <= input; i++) {
        array[i * m - 2] = -1;
      }
    }
    return array;
  }

  public static int count(int[] input) {
    int counter = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i] != -1) {
        counter += 1;
      }
    }
    return counter;
  }
}
