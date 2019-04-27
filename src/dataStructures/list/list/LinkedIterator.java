package dataStructures.list.list;



public class LinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iterator = new LinkIterator(list);

        iterator.insertAfter("Anton", 33);
        iterator.insertBefore("Igor", 22);
        iterator.insertBefore("Anna", 44);
        System.out.println(iterator.getCurrent().name);
        list.display();
    }
}
