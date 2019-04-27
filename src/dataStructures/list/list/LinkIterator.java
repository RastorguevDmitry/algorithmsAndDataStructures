package dataStructures.list.list;

public class LinkIterator {
    private Link current;
    private Link prev;
    private LinkedList list;

    public LinkIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    /**
     * @return - true, если дошел до конца
     */
    public boolean atEnd() {
        return (current.next == null);
    }

    public void insertBefore() {
    }

    public void insertAfter(String name, int age) {
        Link newLink = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    // TODO: 18.04.2019 refactoring
    public void insertBefore(String name, int age) {
        Link newLink = new Link(name, age);
        if (prev == null) {
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        } else {
            newLink.next = prev.next;
            prev.next = newLink;
            current = newLink;
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (prev == null) {
            list.setFirst(current.next);
            reset();
        } else {
            prev.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return name;
    }

    public Link getCurrent() {
        return current;
    }
}
