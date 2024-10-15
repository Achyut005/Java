import java.util.ArrayList;

public class p38 {
    private ArrayList<Object> list = new ArrayList<>();

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int getSize() {
        return list.size();
    }

    // Peek at the top element without removing it
    public Object peek() {
        if (!isEmpty()) {
            return list.get(list.size() - 1);
        }
        return null; // Or throw exception
    }

    // Pop the top element from the stack
    public Object pop() {
        if (!isEmpty()) {
            return list.remove(list.size() - 1);
        }
        return null; // Or throw exception
    }

    // Push a new element onto the stack
    public void push(Object o) {
        list.add(o);
    }

    public static void main(String[] args) {
        p38 stack = new p38();
        
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
