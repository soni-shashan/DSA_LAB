public class PRAC_5{
    public static void main(String[] args) {
        
    }

    public static int[] matBinarySearch(int[][] arr,int target){
        int row=-1,column=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][arr[i].length-1]>=target){
                row=i;
                break;
            }
        }
        if(row==-1){
        int[] ans=new int[2];
        ans[0]=row;
        ans[1]=column;
        return ans;
        }
        int l=0;
        int r=arr[row].length-1;
        while(r>=l){
            int mid=(l+r)/2;
            if(arr[row][mid]==target){
                column=mid;
                break;
            }else if(arr[row][mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        int[] ans=new int[2];
        ans[0]=row;
        ans[1]=column;
        return ans;
    }
}