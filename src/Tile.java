public abstract class Tile {
    private String tileName;
    private String PropertyName;
    private User owner;
    private int intrinsicValue;
    private int rent;

    public void setPropertyName(String propertyName) {
        PropertyName = propertyName;
    }

    public String getPropertyName() {
        return PropertyName;
    }

    public int getIntrinsicValue() {
        return intrinsicValue;
    };

    public void setIntrinsicValue(int intrinsicValue) {
        this.intrinsicValue = intrinsicValue;
    };

    public Tile(String tileName, String propertyName) {
        setTileName(tileName);
        setPropertyName(propertyName);
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

    public boolean isOwned() {
        if (getOwner() == null) {
            return false;
        }
        return true;
    };

    public abstract int rentToBePaid(User currentPlayer);
    public abstract void changeOwner(User currentPlayer);
}
