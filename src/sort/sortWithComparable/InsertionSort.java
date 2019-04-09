package sort.sortWithComparable;

public class InsertionSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) exchange(a, j, j - 1);
                else break;
            }
        }
        assert isSort(a);
    }
}