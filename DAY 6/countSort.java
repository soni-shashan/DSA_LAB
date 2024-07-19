import java.util.Arrays;

public class countSort{
    public static int[] assending(int[] arr){
        int max=arr[0];
        int[] ans=new int[arr.length];
        for(int t:arr){
            if(t>max){
                max=t;
            }
        }
        int[] temp=new int[max+1];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=0;i<arr.length;i++){
            ans[--temp[arr[i]]]=arr[i];
        }
        return ans;
    }
    public static int[] dessending(int[] arr){
        int max=arr[0];
        int[] ans=new int[arr.length];
        for(int t:arr){
            if(t>max){
                max=t;
            }
        }
        int[] temp=new int[max+1];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=0;i<arr.length;i++){
            ans[ans.length-(--temp[arr[i]])-1]=arr[i];
        }
        return ans;
    }
}