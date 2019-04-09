package sort;

public class Array {
    private final int length;
    private int[] arr;
    private int size;
    private boolean sorted = false;

    Array(int size) {
        length = size;
        arr = new int[length];
        this.size = 0;
    }

    void append(int value) {
        if (size < length) {
            arr[size] = value;
            size++;
        }
    }

    void remove(int value) {
        int index = search(value);
        if (index >= 0) {
            System.arraycopy(arr, index + 1, arr, index, size - index - 1);
            size--;
        }
    }

    public int getElement(int index) {
        if (index < size && index >= 0) {
            return arr[index];
        } else {
            throw new IllegalArgumentException("Index should be less than " + size + "and greater than or equal to 0");
        }
    }

    public boolean setElement(int index, int value) {
        if (index < size && index >= 0) {
            arr[index] = value;
            return true;
        } else {
            return false;
        }
    }

    private int search(int value) {
        if (sorted) {
            return binarySearch(value);
        } else {
            return linearSearch(value);
        }
    }

    private int linearSearch(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private int binarySearch(int value) {
        int low = 0;
        int high = size - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(mid + 1);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{ ");
        for (int i = 0; i < size; i++) {
            result.append(arr[i]).append(" ");
        }
        result.append("}");
        return result.toString();
    }

    private void swap(int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }

    void bubbleSort() {
        if (!sorted) {
            sorted = true;
            int cnt;
            int tmp;
            for (int border = size - 1; border > 0; border--) {
                cnt = 0;
                for (int i = 0; i < border; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(i, i + 1);
                        cnt++;
                    }
                }
                if (cnt == 0) return;
            }
        }
    }

    void selectionSort() {
        if (!sorted) {
            sorted = true;
            int smallest;
            for (int pointer = 0; pointer < size - 1; pointer++) {
                smallest = pointer;
                for (int i = pointer + 1; i < size; i++) {
                    if (arr[i] < arr[smallest]) {
                        smallest = i;
                    }
                }
                swap(pointer, smallest);
            }
        }
    }

    void insertionSort() {
        if (!sorted) {
            sorted = true;
            int tmp;
            int pnt;
            for (int border = 1; border < size; border++) {
                tmp = arr[border];
                pnt = border;
                while (pnt > 0 && arr[pnt - 1] > tmp) {
                    arr[pnt] = arr[pnt - 1];
                    pnt--;
                }
                arr[pnt] = tmp;
            }
        }
    }

}
