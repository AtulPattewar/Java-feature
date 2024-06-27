import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        //Declarative programming
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum Declarative"+sum);

        //imperative Programming
        int s = 0;
        for (int i = 0; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("Sum imperative" + s);
    }
}
