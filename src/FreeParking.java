public class FreeParking extends Tile {

    public FreeParking() {
        super(TileType.PARKING.getValue(), "Free Parking");
    }

    @Override
    public int rentToBePaid(User currentPlayer) {
        return 0;
    }

    @Override
    public void changeOwner(User currentPlayer) {
        // Cannot be owned
        return;
    }
}
