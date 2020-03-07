public class Jail extends Tile {
    public Jail() {
        super(TileType.JAIL.getValue(), "Jail");
    }

    @Override
    public int rentToBePaid(User currentPlayer) {
        return 100;
    }

    @Override
    public void changeOwner(User currentPlayer) {
        // Cannot be owned
        return;
    }
}
