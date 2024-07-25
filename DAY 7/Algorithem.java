
public class Algorithem {
    
    public static int[] radixSort(int[] arr,boolean assending) {
        int max=arr[0];
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            arr = countSort(arr, exp, assending);
        }
        return arr;
    }


    private static int[] countSort(int[] arr, int exp, boolean ascending) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[19]; 

        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit + 9]++;
        }

        if (ascending) {
            for (int i = 1; i < 19; i++) {
                count[i] += count[i - 1];
            }
        } else {
            for (int i = 17; i >= 0; i--) {
                count[i] += count[i + 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[--count[digit + 9]] = arr[i];
        }
        return output;
    }
}
