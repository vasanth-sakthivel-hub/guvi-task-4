import java.util.Stack;

class StackOperations {
    private Stack<Integer> stack;

    public StackOperations() {
        stack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto stack");
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println(poppedElement + " popped from stack");
        } else {
            System.out.println("Stack is empty! Cannot pop.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackOperations stackOps = new StackOperations();

        // Pushing elements onto the stack
        stackOps.push(10);
        stackOps.push(20);
        stackOps.push(30);

        // Popping elements from the stack
        stackOps.pop();
        stackOps.pop();
        
        if (stackOps.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
}
