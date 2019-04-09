package dataStructures.priorityQueue;

public class MainPriority {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);

        pq.insert(22);
        pq.insert(11);
        pq.insert(99);
        pq.insert(33);
        pq.insert(88);

        while (!pq.isEmpty()) {
            int n = pq.remove();
            System.out.println(n);
        }
    }
}
