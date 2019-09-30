package Ch03_recursion.Greet;

public class Greet {

    private static void great2(String name) {
        System.out.println("How are you, " + name + "?");
    }

    private static void bye() {
        System.out.println("Ok, bye!");
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        great2(name);
        System.out.println("Getting ready to say bye...");
        bye();
    }

    public static void main(String[] args) {
        greet("Bruce");
    }
}
