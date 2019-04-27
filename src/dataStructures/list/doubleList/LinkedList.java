package dataStructures.list.doubleList;

import dataStructures.list.list.Link;

public class LinkedList {
    public Link first;
    public Link last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            first = newLink;
        } else
            last.next = newLink;
        last = newLink;
    }

    public Link delete() {
        Link temp = first;
        if (first.next == null) last = null;
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isFind(String name) {
        boolean result = false;
        Link current = first;
        while (current.name != null) {
            if (current.name.equals(name)) {
                result = true;
                break;
            } else if (current.next != null)
                current = current.next;
            else break;
        }
        return result;
    }

    /**
     * by Egor Ogdanets
     *
     * @param name
     * @return
     */
    public Link find(String name) {
        Link current = first;
        while (current.name != null) {
            if (current.name == name)
                return current;
            else
                current = current.next;
        }
        return current;
    }


    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
