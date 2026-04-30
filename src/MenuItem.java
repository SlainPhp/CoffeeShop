public abstract class MenuItem {
    protected String name;
    protected double price;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
