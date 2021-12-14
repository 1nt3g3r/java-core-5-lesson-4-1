import java.util.Scanner;

public class SystemOutTest {
    public static void main(String[] args) {
        String text = "123 456 789";

        Scanner scanner = new Scanner(text);

        while (scanner.hasNextInt()) {
            System.out.println("scanner.nextInt() = " + scanner.nextInt());
        }
    }
}
