package dataStructures.queue;

public class MainDeque {
    public static void main(String[] args) {
        Deque dq = new Deque(3);
        dq.pushFront(1);
        dq.pushFront(2);
        dq.pushFront(3);


        while (!dq.isEmpty()) {
            int n = dq.popFront();
            System.out.println(n);
        }

        dq.pushBack(4);
        dq.pushBack(5);
        dq.pushBack(6);

        while (!dq.isEmpty()) {
            int n = dq.popBack();
            System.out.println(n);
        }
    }
}
