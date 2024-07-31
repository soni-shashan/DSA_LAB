import java.util.Scanner;

public class imqueue {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Queue s=new Queue();
        int Chosee=0;
        boolean w=true;
        while (w) {
            System.out.println();
            System.out.println("___________________________________________________");
            System.out.println("Chosee The Following Option Which Is Given Bellow!");
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.print("Enter Chosee Following Options : ");
            Scanner scanner=new Scanner(System.in);
            Chosee=scanner.nextInt();
            System.out.println("___________________________________________________");
            System.out.println();
            switch (Chosee) {
                case 1:
                    int val=0;
                    System.out.print("Enter Value You Need To enqueue : ");
                    val=scanner.nextInt();
                    s.enqueue(val);
                    break;
                case 2:
                    s.dequeue();
                    break;
                case 3:
                    System.out.println("Front Element In Queue Is "+s.peek());
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    w=false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Please Choose Valid Option!!");
                    break;
            }
        }
    }
}
