public class Stack{
    public static int top=-1;
    public static int[] stack=new int[10];
    public  void push(int value){
        if(isFull()){
            System.out.println("Stack Is Full!!");
        }else{
            stack[++top]=value;
            System.out.println(value+" Is Push Successfully!!");
        }
    }
    public  void pop(){
        if(isEmpty()){
            System.out.println("Stack Is Empty!!");
        }else{
            top--;
            System.out.println(stack[top+1]+" Is Pop Successfully!!");
        }
    }
    public  int peek(){
        if(isEmpty()){
            System.out.println("Stack Is Empty!!");
            return -1;
        }else{
            return stack[top];
        }
    }
    public  void display(){
        if(isEmpty()){
            System.out.println("Stack Is Empty!!");
        }else{
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    public static boolean isFull(){
        if(top==9){
            return true;
        }
        return false;
    }
    public static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
}