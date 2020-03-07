public class Go extends Tile {

    public Go() {
        super(TileType.GO.getValue(), "Go");
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
