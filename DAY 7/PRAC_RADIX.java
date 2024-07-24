import java.util.Arrays;

public class PRAC_RADIX {
    public static void main(String[] args) {
        int[] arr={4,57,156,7,25,45};
        int[] ans=radixSort.assending(arr);
        System.out.println("Array In ascending order : "+ Arrays.toString(ans));
        ans=radixSort.dessending(arr);
        System.out.println("Array In descending order : "+ Arrays.toString(ans));
    }
}
