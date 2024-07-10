public class program1 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};
        int ans=ternarySearch.getIndex(arr,50);
        if(ans!=-1)
        System.out.println("arr["+ans+"]="+arr[ans]);
        else
        System.out.println("Element Not Found!!");
    }
}
