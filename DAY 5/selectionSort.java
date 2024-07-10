public class selectionSort {
    public static int[] ascending(int[] arr) {
        int[] t=arr;
        for(int i=0;i<t.length;i++){
            int min=i;
            for(int j=i+1;j<t.length;j++){
                if(t[min]>t[j]){
                    min=j;
                }
            }

            if(min!=i){
                t[i]=t[i]^t[min];
                t[min]=t[i]^t[min];
                t[i]=t[i]^t[min];
            }
        }
        return t;
    }
    
    public static int[] descending(int[] arr) {
        int[] t=arr;
        for(int i=0;i<t.length-1;i++){
            int max=i;
            for(int j=i+1;j<t.length;j++){
                if(t[max]<t[j]){
                    max=j;
                }
            }
            if(max!=i){
                t[i]=t[i]^t[max];
                t[max]=t[i]^t[max];
                t[i]=t[i]^t[max];
            }
        }
        return t;
    }
}
