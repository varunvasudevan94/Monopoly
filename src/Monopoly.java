public class Monopoly {
    // The game driver
    public static void main(String[] args){
        System.out.println("Let the game begin");
        User [] users = new User[4];
        users[0] = new User("varun", Coin.BOOT);
        users[1] = new User("ashis", Coin.BATTLESHIP);
        users[2] = new User("deeksha", Coin.CANON);
        users[3] = new User("aanchal", Coin.IRON);
        Board board = new Board(users);
        board.playMove();
        board.playMove();
        board.playMove();

    }
}
