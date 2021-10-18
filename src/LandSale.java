public record LandSale(int length, int width, int cost) {
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Честная сделка: участок " +
                width + "х" + length + "м продан по цене " +
                cost + " рублей.";
    }
}
