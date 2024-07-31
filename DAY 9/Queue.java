public class Queue{
    public static int front=-1;
    public static int real=-1;
    public static int[] queue=new int[10];
    public  void enqueue(int value){
        if(isFull()){
            System.out.println("Queue Is Full!!");
        }else{
            if(front==-1&&real==-1){
                front++;
                real++;
            }else{
                real++;
            }
            queue[real]=value;
            System.out.println(value+" Is Push Successfully!!");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty!!");
        }else{
            int x=queue[0];
            if(front>real){
                front=-1;
                real=-1;
            }else{
                real--;
                front++;
            }
            System.out.println(x+" Is Pop Successfully!!");
            for(int i=0;i<=real;i++){ 
                queue[i]=queue[i+1];
            }
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Is Empty!!");
            return -1;
        }else{
            return queue[0];
        }
    }
    public  void display(){
        if(isEmpty()){
            System.out.println("Queue Is Empty!!");
        }else{
            for(int i=0;i<=real;i++){
                System.out.println(queue[i]);
            }
        }
    }
    public static boolean isFull(){
        if(real==9){
            return true;
        }
        return false;
    }
    public static boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
}