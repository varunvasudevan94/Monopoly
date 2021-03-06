public enum TileType {
    PROPERTY("PROPERTY"),
    JAIL("JAIL"),
    COMMUNITY_CHEST("COMMUNITY_CHEST"),
    CHANCE("CHANCE"),
    PARKING("PARKING"),
    INCOME_TAX("INCOME_TAX"),
    GO("GO");

    private String value;
    TileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
