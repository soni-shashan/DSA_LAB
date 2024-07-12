import java.util.Arrays;

public class practical4 {
    public static void main(String[] args) {
        int[] arr={2,5,1,67,5,2,4};
        int[] a=insertionSort.ascending(arr);
        System.out.println("Array In ascending order : "+ Arrays.toString(a));
        int[] d=insertionSort.descending(arr);
        System.out.println("Array In descending order : "+Arrays.toString(d));
    }
}
