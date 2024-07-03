import java.util.Arrays;

public class PRAC_4_2 {
    public static void main(String[] args) {
        int[] arr={0,0,1,2,2};
        System.out.print(specialArray(arr));
    }
    public static int specialArray(int[] nums) {
        // for(int x=0;x<=nums.length;x++){
        //     int t=0;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]>=x){
        //             t++;
        //         }
        //     }
        //     if(t==x){
        //         return x;
        //     }
        // }   
        // return -1; 
        //mid+ count- <--> mid- count+
        //ans>mid -->r
        //ans<mid -->l   {0,1,2,3,4}
        //{0,0,4,3,0,4}  {0,0,3,4,4}
        //{3,4}
        //{4,4}
        Arrays.sort(nums);
        int l=0;
        int r=nums.length;
        while (r>=l) {
                int mid=r-(r-l)/2;
                int ans=count(nums,mid);
                if(ans==mid){
                    return mid;
                }else if(ans>mid){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        return -1;
    }

    public static int count(int []nums, int target){
        int ans = 0;
        for(int num : nums){
            if(num>=target) ans++;
            
        }
    return ans;
    }
}
