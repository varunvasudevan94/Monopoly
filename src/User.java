public class User {
    private String username;
    private Coin coin;

    public User(String username, Coin coin){
        setUsername(username);
        setCoin(coin);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    private int currentPosition; //ranges from 0 - 39 for each tile

    public String getUsername() {
        return username;
    }

    public Coin getCoin() {
        return coin;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
