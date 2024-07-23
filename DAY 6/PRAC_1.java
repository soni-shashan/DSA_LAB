import java.util.Arrays;

public class PRAC_1 {
    public static void main(String[] args) {
        int[] arr={2,9,7,4,1,8,4};
        int[] ans=countSort.assending(arr);
        System.out.println("Array In ascending order : "+ Arrays.toString(ans));
        ans=countSort.dessending(arr);
        System.out.println("Array In descending order : "+ Arrays.toString(ans));
    }
}