public class PRAC_4_1 {
    public static void main(String[] args) {
        int[] arr={0,0};
        System.out.print(specialArray(arr));
    }
    public static int specialArray(int[] nums) {
        for(int x=0;x<=nums.length;x++){
            int t=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=x){
                    t++;
                }
            }
            if(t==x){
                return x;
            }
        }   
        return -1;
    }
}
