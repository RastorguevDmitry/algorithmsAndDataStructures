package dataStructures.stack;


public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }

    private static String reverse(String s) {
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
