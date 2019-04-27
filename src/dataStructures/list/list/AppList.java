package dataStructures.list.list;

public class AppList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Anton", 22);
        list.insert("Oleg", 26);
        list.insert("Igor", 31);
//       Igor -> Oleg -> Anton

        list.display();
        System.out.println();

        list.delete("Oleg");
        System.out.println(list.find("Anton").name);
//        if (!list.isEmpty()) {
//            list.delete();
//        }
        list.display();
    }
}
