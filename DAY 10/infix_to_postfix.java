import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner s=new Scanner(System.in);
        String exp=s.nextLine();
        s.close();
        infixToPostfix(exp);
    }
    public static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    public static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; 
    }
    public static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }else if (c == '(') {
                stack.push(c);
            }else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }else {
                while (!stack.isEmpty() && (prec(s.charAt(i)) <= prec(stack.peek()) && associativity(s.charAt(i)) == 'L')) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }       
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}