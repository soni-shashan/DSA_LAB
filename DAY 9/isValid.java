import java.util.Stack;

public class isValid {
    public static boolean check(String a){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='['||a.charAt(i)=='{'||a.charAt(i)=='('){
                s.push(a.charAt(i));
            }else if(a.charAt(i)==']'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='['){
                    s.pop();
                }else{
                    return false;
                }
            }else if(a.charAt(i)=='}'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='{'){
                    s.pop();
                }else{
                    return false;
                }
            }else if(a.charAt(i)==')'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='('){
                    s.pop();
                }else{
                    return false;
                }

            }
        }
        if(s.empty()){
            return true;
        }else{
            return false;
        }
    }
}
