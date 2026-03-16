import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Definition
        // Queue<Integer> myQueue = new ArrayDeque<Integer>();
        // Deque<Integer> stack = new ArrayDeque<Integer>();

        // myQueue.offer(1);
        // stack.push(1);
        // myQueue.offer(2);
        // stack.push(2);
        // myQueue.offer(3);
        // stack.push(3);
        // myQueue.offer(4);
        // stack.push(4);
        // myQueue.offer(5);
        // stack.push(5);
        // myQueue.offer(6);
        // stack.push(6);

        // System.out.println(myQueue);
        // System.out.println(stack);

        // System.out.println("Next:"  + myQueue.peek());
        // System.out.println("Next Stack:" + stack.peek());

        // System.out.println(myQueue);

        Scanner scan = new Scanner(System.in);
        Queue<Integer> myQueue = new ArrayDeque<Integer>();
        Queue<Integer> lastFive = new ArrayDeque<Integer>();
        int cont = 1;

        while (true) {
            System.out.println("Option:");
            System.out.println("1. New Turn");
            System.out.println("2. What's the next turn");
            System.out.println("3. Attent next");
            System.out.println("4. Last 5 turns");
            System.out.println("Exit");   

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    myQueue.offer(cont);
                    
                    cont++;
                    
                    break;

                case 2:
                    System.out.println("Next: " + myQueue.peek());
                    break;

                case 3:
                    int current = myQueue.poll();

                    if (lastFive.size() == 5)
                        lastFive.poll();

                    lastFive.offer(current);
                    
                    System.out.println("Atteding: " + current);
                    break;
            
                case 4:
                    System.out.println("Last 5" + lastFive);

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }    
    }
}
