import java.util.Arrays;

public class practical3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10};
        int[] a=selectionSort.ascending(arr);
        System.out.println("Array In ascending order : "+ Arrays.toString(a));
        int[] d=selectionSort.descending(arr);
        System.out.println("Array In descending order : "+Arrays.toString(d));
    }
}
