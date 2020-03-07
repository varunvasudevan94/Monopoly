public abstract class Tile {
    private String tileName;
    private User owner;
    private int intrinsicValue;
    private int rent;


    public int getIntrinsicValue() {
        return intrinsicValue;
    };

    public void setIntrinsicValue(int intrinsicValue) {
        this.intrinsicValue = intrinsicValue;
    };

    public Tile(String tileName) {
        setTileName(tileName);
    };

    public void setRent(int rent) {
        this.rent = rent;
    };

    public int getRent(){
        return this.rent;
    };

    public void setTileName(String tileName) {
        this.tileName = tileName;
    };

    public void setOwner(User owner) {
        this.owner = owner;
    };

    public String getTileName() {
        return tileName;
    };

    public User getOwner() {
        return owner;
    };

    public abstract int rentToBePaid(User currentPlayer);
}
