package dataStructures.stack;

public class Stack<T> {
    private Object[] stack;
    private int top;
    private int maxsize;

    public Stack(int size) {
        this.maxsize = size;
        this.stack = new Object[maxsize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void push(T i) {
        stack[++top] = i;
    }

    public Object pop() {
        return stack[top--];
    }

    public Object peek() {
        return stack[top];
    }
}

