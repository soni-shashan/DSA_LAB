import java.util.Scanner;

public class PRAC_3_2 {
    public static int n=0;
    public static int t=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
        }
        System.out.print("Enter Array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(scanner.hasNextInt()){
                arr[i]=scanner.nextInt();
            }
        }
        System.out.print("Enter Target Element: ");
        if(scanner.hasNextInt()){
            t=scanner.nextInt();
        }
        int ans=binarySearch(arr, t);
        if(ans==-1){
            System.out.println("Target Is Not Found In Array");
        }else{
            System.out.println("Target Is Fount At Index "+ans+" In Array");
        }
        scanner.close();
    }
    public static int binarySearch(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(r>=l){
            int mid=r-(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
}