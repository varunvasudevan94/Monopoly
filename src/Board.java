public final class Board {
    int TOTAL_TILES = 40;
    int TOTAL_PLAYERS = 4;

    private Dice [] dices = new Dice [2];
    private Tile [] tiles = new Tile[TOTAL_TILES];
    private User [] users;
    
    private int currentPlayerNumber;



    public Board (User users[]) {
        this.users = users;
        // Initialise Dice;
        dices[0] = new Dice();
        dices[1] = new Dice();

        // Game has not yet started
        this.currentPlayerNumber = 0;

        initializeTiles();

    };

    private void initializeTiles() {
        tiles[0] = new Go();
        // First Side
        tiles[1] = new Property("Old Kent Road", Color.BROWN, 60);
        tiles[2] = new CommunityChest();
        tiles[3] = new Property("White Chappel Road", Color.BROWN, 80);
        tiles[4] = new IncomeTax();
        tiles[5] = new Property("Kings Cross Station", Color.WHITE, 100);
        tiles[6] = new Property("The Angel Islington", Color.SKY_BLUE, 100);
        tiles[7] = new CommunityChest();
        tiles[8] = new Property("Euston Road", Color.SKY_BLUE, 100);
        tiles[9] = new Property("Pentoville Road", Color.SKY_BLUE, 120);

        tiles[10] = new Jail();

        // Second Side
        tiles[11] = new Property("Pall Mall", Color.PINK, 140);
        tiles[12] = new Property("Electric Company", Color.WHITE, 120);
        tiles[13] = new Property("White Hall", Color.PINK, 140);
        tiles[14] = new Property("Northumberland Avenue", Color.PINK, 160);
        tiles[15] = new Property("Marylebone Station", Color.WHITE, 100);
        tiles[16] = new Property("Bow Street", Color.ORANGE, 180);
        tiles[17] = new CommunityChest();
        tiles[18] = new Property("Marlborough Street", Color.ORANGE, 180);
        tiles[19] = new Property("Vine Street", Color.SKY_BLUE, 200);

        tiles[20] = new FreeParking();

        // Third Side
        tiles[21] = new Property("Strand", Color.RED, 220);
        tiles[22] = new CommunityChest(); // This should be Chance
        tiles[23] = new Property("Fleet Street", Color.RED, 220);
        tiles[24] = new Property(   "Trafalgar Square", Color.RED, 240);
        tiles[25] = new Property("Fenchurch Station", Color.WHITE, 100);
        tiles[26] = new Property("Leicester Square", Color.YELLOW, 260);
        tiles[27] = new Property("Coventry Street", Color.YELLOW, 260);
        tiles[28] = new Property("Water Works", Color.WHITE, 150);
        tiles[29] = new Property("Picaddily", Color.YELLOW, 280);

        tiles[30] = new FreeParking(); // This should be Go to Jail

        // Fourth Side
        tiles[31] = new Property("Regent Street", Color.GREEN, 300);
        tiles[32] = new Property("Oxford Street", Color.GREEN, 300);
        tiles[33] = new CommunityChest();
        tiles[34] = new Property(   "Bond Street", Color.GREEN, 320);
        tiles[35] = new Property("Liverpool Station", Color.WHITE, 100);
        tiles[36] = new CommunityChest();
        tiles[37] = new Property("Park Lane", Color.BLUE, 350);
        tiles[38] = new IncomeTax();
        tiles[39] = new Property("Mayfair", Color.BLUE, 400);

    };

    private void rollDice() {
        dices[0].rollDice();
        dices[1].rollDice();
    };

    private int getDiceValue () {
        return this.dices[0].getCurrentValue() + this.dices[1].getCurrentValue();
    };

    private void movePlayer() {
        User currentUser = this.users[this.currentPlayerNumber];
        System.out.println("Current User "  + currentUser.getUsername());
        int currentPosition = currentUser.getCurrentPosition();
        int diceValue = getDiceValue();

        Tile currentTile = this.tiles[currentPosition];
        System.out.println("Current Tile " + currentTile.getPropertyName());

        System.out.println("Dice Rolled " + diceValue);

        int newTilePosition = (currentPosition + diceValue) % TOTAL_TILES;
        System.out.println("New Tile Position " + newTilePosition);

        Tile newTile = this.tiles[newTilePosition];
        currentUser.setCurrentPosition(newTilePosition);
        if (! newTile.isOwned() ) {
            newTile.setOwner(currentUser);
        } else {
            int rentToBePaid = newTile.rentToBePaid(currentUser);
            String rentCreditUser = newTile.getOwner().getUsername();
        }
    };

    private void changeCurrentPlayerNumber() {
        if (this.dices[0].getCurrentValue() == this.dices[1].getCurrentValue()) {
            return;
        }
        this.currentPlayerNumber = (this.currentPlayerNumber + 1) % TOTAL_PLAYERS;
    }
    public void playMove() {
        rollDice();
        movePlayer();
        changeCurrentPlayerNumber();

    }
}
