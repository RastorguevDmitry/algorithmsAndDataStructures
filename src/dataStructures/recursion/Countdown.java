package dataStructures.recursion;

public class Countdown {
    public static void main(String[] args) {
        countdown(3);
    }

    private static int countdown(int n) {
        System.out.println(n);
        if (n == 1) return 1;
        return countdown(n - 1);
    }
}
