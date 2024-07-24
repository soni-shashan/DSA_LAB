import java.util.Arrays;

public class radixSort {
    public static int[] assending(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int len=0,len_x=0;
        for(int i=0,x=arr[0];i<arr.length;i++){
            x=arr[i];
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        for(;max!=0;len++,len_x++,max/=10);
        if(min>=0){
            for(int pos=1;len>0;pos*=10,len--){
                arr=assradixCount(arr, pos);
            }
        }else{
            int p=0,n=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=0){
                    p++;
                }else{
                    n++;
                }
            }
            int[] arr1=new int[p];
            int[] arr2=new int[n];
            int[] ans=new int[arr.length];
            for(int i=0,y=0,z=0;i<arr.length;i++){
                if(arr[i]>=0){
                    arr1[y]=arr[i];
                    y++;
                }else{
                    arr2[z]=arr[i];
                    z++;
                }
            }
            for(int pos=1;len_x>0;pos*=10,len_x--){
                arr1=assradixCount(arr1, pos);
            }
            for(int pos=1;len>0;pos*=10,len--){
                arr2=negderadixCount(arr2, pos);
            }
            for(int i=0;i<arr.length;i++){
                if(i<arr2.length){
                    ans[i]=arr2[i];
                }else{
                    ans[i]=arr1[i-arr2.length];
                }
            }
            return ans;
        }
        return arr;
    }
    public static int[] dessending(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int len=0,len_x=0;
        for(int i=0,x=arr[0];i<arr.length;i++){
            x=arr[i];
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        for(;max!=0;len++,len_x++,max/=10);
        if(min>=0){
            for(int pos=1;len>0;pos*=10,len--){
                arr=assradixCount(arr, pos);
            }
        }else{
            int p=0,n=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=0){
                    p++;
                }else{
                    n++;
                }
            }
            int[] arr1=new int[p];
            int[] arr2=new int[n];
            int[] ans=new int[arr.length];
            for(int i=0,y=0,z=0;i<arr.length;i++){
                if(arr[i]>=0){
                    arr1[y]=arr[i];
                    y++;
                }else{
                    arr2[z]=arr[i];
                    z++;
                }
            }
            for(int pos=1;len_x>0;pos*=10,len_x--){
                arr1=deradixCount(arr1, pos);
            }
            for(int pos=1;len>0;pos*=10,len--){
                arr2=negassradixCount(arr2, pos);
            }
            for(int i=0;i<arr.length;i++){
                if(i<arr1.length){
                    ans[i]=arr1[i];
                }else{
                    ans[i]=arr2[i-arr1.length];
                }
            }
            return ans;
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
    public static int[] negderadixCount(int[] arr,int pos){
        int[] ans=new int[arr.length];
        int[] temp=new int[10];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[-(arr[i]/pos)%10]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=0;i<arr.length;i++){
            ans[arr.length-(--temp[-(arr[i]/pos)%10])-1]=arr[i];
        }
        return ans;
    }
    public static int[] negassradixCount(int[] arr,int pos){
        int[] ans=new int[arr.length];
        int[] temp=new int[10];
        Arrays.fill(temp, 0);
        for(int i=0;i<arr.length;i++){
            temp[-(arr[i]/pos)%10]++;
        }
        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            ans[--temp[-(arr[i]/pos)%10]]=arr[i];
        }
        return ans;
    }
}