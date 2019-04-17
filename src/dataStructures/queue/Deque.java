package dataStructures.queue;

class Deque {
    private int size;
    private int head;// голова
    private int tail;// хвост
    private int[] data;
    private int items;

    Deque(int size) {
        data = new int[this.size = size];
        items = 0;
    }

    void pushBack(int value) {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
        items++;
    }

    int popBack() {
        int temp = data[tail];
        if (--tail < 0)
            tail = size - 1;
        items--;
        return temp;
    }

    void pushFront(int value) {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
        items++;
    }

    int popFront() {
        if (++head == size)
            head = 0;
        items--;
        return data[head];
    }

    boolean isEmpty() {
        return (items == 0);
    }
}