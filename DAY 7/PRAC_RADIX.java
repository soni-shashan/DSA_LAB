import java.util.Arrays;

public class PRAC_RADIX {
    public static void main(String[] args) {
        int[] arr={4,5,7,2,-54,6,7,-85,-65,-4,-23,76,45,356};
        int[] ans=Algorithem.radixSort(arr,true);
        System.out.println("Array In ascending order : "+ Arrays.toString(ans));
        ans=Algorithem.radixSort(arr,false);
        System.out.println("Array In descending order : "+ Arrays.toString(ans));
    }
    //assending
    //4,5,76,7,2,-54,6,7,-85,-65,-4,-23,45,356
    //arr1 => 4,5,76,7,2,6,7,45,356
    //arr2 => -54,-85,-65,-4,-23
    //ans1 => -85,-65,-54,-23,-4 descending use -(arr[i]/10)%10 for indexing
    //ans2 => 2,4,5,7,7,45,76,356 assending
    //ans= ans1 merge with ans2
    //4,5,76,7,2,-54,6,7,-85,-65,-4,-23,45,356
    //int[] temp{ 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,0}
    //           -9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9
    //      temp[digit+9] where digit=(arr[i]/exp)%10
}
