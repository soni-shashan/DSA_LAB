import java.util.Arrays;

public class practical2 {
    public static void main(String[] args) {
        int[] arr={2,56,7,5,4};
        int[] a=bubbleSort.ascending(arr);
        System.out.println("Array In ascending order : "+Arrays.toString(a));
        int[] d=bubbleSort.descending(arr);
        System.out.println("Array In descending order : "+Arrays.toString(d));

    }   
}
