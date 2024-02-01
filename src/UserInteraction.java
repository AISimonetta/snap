import java.util.Scanner;
public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);

        public int userTurn() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("* Please press ENTER, It's your turn!");
        int turn = scanner.nextInt();
        return turn;
    }

}

