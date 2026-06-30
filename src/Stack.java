import java.util.ArrayList;

public class Stack<T> {
    public ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }
    public boolean empty(){
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public T push(T item){
        stack.addLast(item);
        return item;
    }

    public T pop(){
        T last = stack.getLast();
        stack.removeLast();
        return last;
    }

    public T peek(){
        return stack.getLast();
    }

    @Override
    public String toString(){
        return stack.toString();
    }
}
