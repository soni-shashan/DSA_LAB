import java.util.Arrays;

public class radixSort {
    public static int[] assending(int[] arr){
        int max=arr[0];
        int len=0;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        for(;max!=0;len++,max/=10);
        for(int pos=1;len>0;pos*=10,len--){
            arr=assradixCount(arr, pos);
        }
        return arr;
    }
    public static int[] assradixCount(int[] arr,int pos){
        int[] ans=new int[arr.length];
        int[] temp=new int[10];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[(arr[i]/pos)%10]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            ans[--temp[(arr[i]/pos)%10]]=arr[i];
        }
        return ans;
    }
    public static int[] dessending(int[] arr){
        int max=arr[0];
        int len=0;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        for(;max!=0;len++,max/=10);
        for(int pos=1;len>0;pos*=10,len--){
            arr=deradixCount(arr, pos);
        }
        return arr;
    }
    public static int[] deradixCount(int[] arr,int pos){
        int[] ans=new int[arr.length];
        int[] temp=new int[10];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[(arr[i]/pos)%10]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=0;i<arr.length;i++){
            ans[arr.length-(--temp[(arr[i]/pos)%10])-1]=arr[i];
        }
        return ans;
    }
}