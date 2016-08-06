import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      String text = "";
      text += i % 3 == 0 ? "Fizz" : "";
      text += i % 5 == 0 ? "Buzz" : "";
      System.out.print(text.isEmpty() ? i : text);
    }
  }
}
