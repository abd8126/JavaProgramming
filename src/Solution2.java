import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int price = sc.nextInt();

        int buy = 0;
        for (int i = 0; i < size; i++) {
            if (buy < arr[i]) {
                buy = arr[i];
            }
        }
      //  System.out.println(buy);
        int totalprice = buy * price;
        System.out.println(totalprice);

    }
}  