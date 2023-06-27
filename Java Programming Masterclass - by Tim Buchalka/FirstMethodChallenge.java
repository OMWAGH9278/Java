

public class FirstMethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName +
                " managed to get into position "
                +playerPosition+
                " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if(playerScore >= 1000) position = 1;
        else if(playerScore >= 500) position = 2;
        else if(playerScore >= 100) position = 3;

        return (position);
    }

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("James", highScorePosition);
    }
}
