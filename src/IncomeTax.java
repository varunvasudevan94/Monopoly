public class IncomeTax extends Tile {
    public IncomeTax(){
        super(TileType.INCOME_TAX.getValue(), "Income Tax");
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
