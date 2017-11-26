import java.util.Scanner;

/**
 * Created by adavi on 23.11.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Game game = new Game();

        game.letPlay();
       String userName = game.askName();

      String userChoose =  game.chooseGame(userName);

      game.compareAnswer(userChoose,userName);

        System.out.println("---------------------------------------");
        System.out.println();

        int userFingers = game.userChooseFingers(userName);
       int computerFingers = game.computerChooseFingers();

        System.out.println("---------------------------------------");
        System.out.println();

        int sumFingers = game.sumUserAndComputerFingers(userFingers,computerFingers);
        game.whoWins(userName,sumFingers);

    }
}
