public class Monopoly {
    // The game driver
    public static void main(String[] args){
        System.out.println("Let the game begin");
        User [] users = new User[4];
        users[0] = new User("varun", Coin.BOOT);
        users[1] = new User("ashis", Coin.BATTLESHIP);
        users[2] = new User("deeksha", Coin.CANON);
        users[3] = new User("aanchal", Coin.IRON);

        Dice [] dices = new Dice[2];
        dices[0] = new Dice();
        dices[1] = new Dice();

        dices[0].rollDice();
        dices[1].rollDice();

        Property oldKentRoad = new Property("Old Kent Road", Color.BROWN, 60);
        oldKentRoad.changeOwner(users[0]);
        System.out.println(oldKentRoad.rentToBePaid(users[0]));

    }
}
