public class CommunityChest extends Tile {
    // Do some Random events here
    public CommunityChest() {
        super(TileType.COMMUNITY_CHEST.getValue(), "Community Chest");
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

    public void doSomeRandomAction() {

    }
}
