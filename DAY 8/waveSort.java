public class waveSort {
    public static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i+=2){
            if((arr[i]<arr[i+1]&&arr[i]>arr[i-1])){
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        return arr;
    }
}
