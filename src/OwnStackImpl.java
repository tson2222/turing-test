import java.util.Arrays;
import java.util.Stack;

public class OwnStackImpl<T> {


    public static void main(String[] args) {
        OwnStackImpl<String> stack = new OwnStackImpl<>();
        String ref1 = "hello";
        stack.push(ref1);
        stack.push("stack1");
        stack.push("stack2");
        stack.push("stack3_old");
        stack.pop();
        System.out.println("stack size " + stack.size());
        System.out.println(stack.contains(ref1));
        stack.push("stack3_new");
        stack.peek();
        stack.pop();
        stack.peek();

        Stack<String> inbuiltStack = new Stack<>();

        inbuiltStack.push("Welcome");
        inbuiltStack.push("To");
        System.out.println(inbuiltStack.pop());
        inbuiltStack.push("Geeks");
    }

    private T[] stackContent;

    private int stackTopPointer;

    public OwnStackImpl(){
        stackContent = (T[]) new Object[1000];
        stackTopPointer = 0;
    }

    public void push(T newObject){
        stackContent[stackTopPointer++] = newObject;
        System.out.println("Pushed: " + newObject.toString() + " on top of the stack at index " + (stackTopPointer-1));

    }

    public T pop(){
        if(stackTopPointer == 0){
            throw new IllegalStateException("Cant pop value from empty stack!");
        }
        T poppedObject = stackContent[--stackTopPointer];
        System.out.println("Popped: " + poppedObject.toString());
        return poppedObject;
    }

    public boolean contains(T stackObject){
        return Arrays.asList(stackContent).contains(stackObject);
    }

    public T peek(){
        T peekedObject = stackContent[stackTopPointer-1];
        System.out.println("Peeking: " + peekedObject.toString());
        return peekedObject;
    }

    public int size(){
        return stackTopPointer;
    }
}
