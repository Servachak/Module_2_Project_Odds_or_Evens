import java.util.InputMismatchException;
import java.util.Random;

/**
 * Created by adavi on 23.11.2017.
 */
public class Game implements InterfaceGame {


    @Override

/** 1 -st part Pick odds or evens**/
    public void letPlay(){
        System.out.println("Let’s play a game called “Odds and Evens”");

     }
     public String tryCatch(){

        String userInput = "";
        try{
            userInput = Main.scanner.next();

        }catch (InputMismatchException e){
            e.getMessage();
        }

        return userInput.toUpperCase();
    }
    public String askName() {

        System.out.println("What is your name?");

        String userName = tryCatch();

        return userName;

    }

    @Override
    public String chooseGame(String userName) {

        System.out.println("Hi " + userName + ". Which do you choose? (O)dds or (E)Evens?");

        String userChoose = tryCatch();

        return userChoose;
    }

    @Override
    public String compareAnswer(String userChoose, String userName) {

         if (userChoose.equals("O")){

             System.out.println(userName + " has picked odds! The computer will be evens.");
         }else{
             System.out.println(userName + " has picked evens! The computer will be odds.");
         }

        return userChoose;
    }
    /**2 - nd part  Play the Game**/
    @Override
    public int userChooseFingers(String userName) {
        System.out.println(userName + " How many \"fingers\" do you put out?");

        int userFinger = Main.scanner.nextInt();
        System.out.println(userName + " choose: " + userFinger);

        return userFinger;
    }

    @Override
    public int computerChooseFingers() {

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("computer choose: " + computer);

        return computer;
    }

    @Override
    public int sumUserAndComputerFingers(int userFinger, int computerFingers) {

        int sumUserAndComputerFingers = userFinger + computerFingers;
        if (sumUserAndComputerFingers % 2 == 0) {
            System.out.println(sumUserAndComputerFingers + "... even!");
        }else {
            System.out.println(sumUserAndComputerFingers + "...odd!");
        }
        return sumUserAndComputerFingers;
    }

    @Override
    public void whoWins(String userName, int sumFingers) {
        if (sumFingers % 2 == 0){
            System.out.println("computer wins");
        }else{
            System.out.println(userName + " wins");
        }

    }
}
