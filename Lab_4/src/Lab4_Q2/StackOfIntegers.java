package Lab4_Q2;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }
    
    public boolean empty() {
        if(size == 0) {
            return true;
        }
        return false;
    }
    
    public int peek() {
        return elements[size -1]; 
    }
    
    public void push(int value) {
        elements[size] = value;
        size++;
    }
    
    public int pop() {
        int topElement = -1;
        if(size > 0) {
            size--;
            topElement = elements[size];
            int[] newElements = new int[size];
            for (int i = 0, k = 0; i < size; i++) {
                if (i == size) {
                    continue;
                }
                newElements[k++] = elements[i];
            }
        }
        return topElement;
    }
    
    public int getSize() {
        return size;
    }
}
