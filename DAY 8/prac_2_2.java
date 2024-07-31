import java.util.Arrays;

public class prac_2_2{
public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int[] arr={3,5,6,9,8,7};
        sort(arr);
        System.out.println("Sort : "+Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for (int i = n - 1; i > 0; i--)
        {
            // Check if arr[i] 
            // is not in order
            if (arr[i] < arr[i - 1])
            {
                // Find the other element 
                // to be swapped with arr[i]
                int j = i - 1;
                while (j >= 0 && arr[i] < arr[j])
                    j--;
     
                // Swap the pair
                int temp = arr[i];
                arr[i] = arr[j + 1];
                arr[j + 1] = temp;
         
                break;
            }
        }
    }
}