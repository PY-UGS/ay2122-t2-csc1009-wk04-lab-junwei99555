package Lab4_Q2;

public class Main {
    private static int capacity = 20;
    
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(capacity);
        
        for(int i = 0; i < 20; i++) {
            stack.push(i);
        }
        
        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        
    }
}
