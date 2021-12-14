import java.util.Arrays;

public class PlayerArrayTest {
    public static void main(String[] args) {
        Player[] players = new Player[5];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i + 1);
        }

        System.out.println("Arrays.toString(players) = " + Arrays.toString(players));
    }
}
