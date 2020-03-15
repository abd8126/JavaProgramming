import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        for(int i=1;i<num;i++)
        {
            if((arr[i]>arr[i+1])&& (arr[i]>arr[i-1]))
            {
                System.out.println(arr[i]);
                break;
            }
        } 