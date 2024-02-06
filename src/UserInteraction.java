import javax.swing.*;
import java.util.Scanner;
public class UserInteraction {
    private Scanner scanner = new Scanner(System.in);


        public String getPlayerName() {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("* Please enter your name: ");
            String playerName = scanner.nextLine();
            return playerName;
        }

        public int userTurn() {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("* Please press ENTER, It's your turn!");
            int turn = scanner.nextInt();
            return turn;
        }

        public int playerTwoSaysSnap() {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("* Be quick!!Press enter to say SNAP");
            int turn = scanner.nextInt();
            return turn;
        }

        public boolean playAgain() {
            System.out.println("* Would you like to play again? ( 0 for No, 1 for Yes): ");
            boolean chooseToPlayAgain = scanner.nextInt() == 1;
            if (chooseToPlayAgain) {
                return true;
            } else {
                return false;
            }
        }
}

