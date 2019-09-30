package Ch03_recursion.Countdown;

public class Countdown {

    private static void countdown(int i) {
        System.out.println(i);

        if (i <= 1) {
            return;
        }

        countdown(i - 1);
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
