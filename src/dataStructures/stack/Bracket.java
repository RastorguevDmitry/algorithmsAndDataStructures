package dataStructures.stack;

public class Bracket {

    private String input;

    public Bracket(String in) {
        this.input = in;
    }

       public void check() {
        int size = input.length();
        Stack st = new Stack(size);
        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    st.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!st.isEmpty()) {
                        char chr = (char)st.pop();
                        if ((ch == '}' && chr != '{') ||
                                (ch == ']' && chr != '[') ||
                                (ch == ')' && chr != '(')) {
                            System.out.println("Ошибка в " + ch + " в " + i);
                        }
                    } else
                        System.out.println("Ошибка в " + ch + " в " + i);
                    break;
                default:
                    break;
            }
        }
        if (!st.isEmpty()) {
            System.out.println("Отсутствие правого символа");
        }
    }
}
