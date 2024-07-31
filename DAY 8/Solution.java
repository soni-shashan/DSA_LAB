import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        for(int i=0;i<x;i++){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=scanner.nextInt();
            }
            sortInWave(arr,n);
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
     public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);

        // Swap adjacent elements
        for (int i=0; i<n; i += 2){
             if(i > 0 && arr[i - 1] > arr[i])
              swap(arr, i, i-1);
              if(i < n-1 && arr[i + 1] > arr[i])
              swap(arr, i, i+1);
        }
    }
}