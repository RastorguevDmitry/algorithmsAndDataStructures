package dataStructures.queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(11);
        q.insert(22);
        q.insert(33);
        q.insert(44);
        q.insert(55);

        q.remove();
        q.remove();

        q.insert(66);
        q.insert(77);

        while(!q.isEmpty()){
            int n = q.remove();
            System.out.println(n);
        }
    }
}
