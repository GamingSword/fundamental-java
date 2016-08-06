import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.print(euclid(105, 252));
    }
    
    public static int euclid(int a, int r) {
        int b;
        if (r > a) {
            b = a;
            a = r;;
            r = b;
        }
        while (r != 0) {
            b = r;
            r = a % r;
            a = b;
        }
        return a;
    }
}
