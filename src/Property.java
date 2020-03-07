public class Property extends Tile {
    private Color color;


    private int computeRent(int intrinsicValue) {
        // roughly 4 percent of the value is rent
        return (4 * intrinsicValue) /100;
    }
    public Property(String propertyName, Color color, int intrinsicValue){
        super(TileType.PROPERTY.getValue(), propertyName); // This is of property type
        int rent = computeRent(intrinsicValue);

        // Set all the values;
        setColor(color);
        setIntrinsicValue(intrinsicValue);
        setRent(rent);
        setOwner(null);

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int rentToBePaid(User currentPlayer) {
        if (getOwner() == null){
            return 0;
        } else if (currentPlayer.getUsername() != getOwner().getUsername()){
            return getRent();
        }

        return 0;
    }

    @Override
    public void changeOwner(User currentPlayer) {
        if (getOwner() == null) {
            setOwner(currentPlayer);
        } else {
            System.out.println("Property already owned");
        }

    }


}
