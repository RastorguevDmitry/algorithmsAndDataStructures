package sort;

public class MainSort {

    public static void main(String[] args) {

        int size = 1000;
        int random;
        long time;

        Array bubbleArray = new Array(size);
        Array selectArray = new Array(size);
        Array insertArray = new Array(size);

        for (int i = 0; i < size; i++) {
            random = (int) Math.round(Math.random() * 1000);
            bubbleArray.append(random);
            selectArray.append(random);
            insertArray.append(random);
        }

        // Bubble sort demonstration.
        time = System.currentTimeMillis();
        bubbleArray.bubbleSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for bubbleSort: " + time + " milliSeconds.\n");

        // Selection sort demonstration.
        time = System.currentTimeMillis();
        selectArray.selectionSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for selectionSort: " + time + " milliSeconds.\n");

        // Insertion sort demonstration.
        time = System.currentTimeMillis();
        insertArray.insertionSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for insertionSort: " + time + " milliSeconds.\n");
    }

}
