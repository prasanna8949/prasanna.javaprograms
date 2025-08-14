public class Main{
    public static String repeat(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat('*', i) + repeat(' ', 2 * (n - i)) + repeat('*', i));
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.println(repeat('*', i) + repeat(' ', 2 * (n - i)) + repeat('*', i));
        }
    }
}
