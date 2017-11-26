/**
 * Created by adavi on 23.11.2017.
 */
public interface InterfaceGame {


    void letPlay();
    String askName();
    String chooseGame(String userName);
    String compareAnswer(String userChoose, String userName);

    int userChooseFingers(String userName);
    int computerChooseFingers();
    int sumUserAndComputerFingers(int userFinger, int computerFingers);

    void whoWins(String userName, int sumFingers);

}
