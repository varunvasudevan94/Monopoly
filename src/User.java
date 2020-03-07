public class User {
    private String username;
    private Coin coin;
    private int currentPosition; //ranges from 0 - 39 for each tile

    public User(String username, Coin coin){
        setUsername(username);
        setCoin(coin);
        setCurrentPosition(0);
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
