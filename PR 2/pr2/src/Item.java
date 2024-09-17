public class Item {
    String name;
    float price;

    Item() {
        name = "No name";
        price = 0;
    }

    Item(String name, float price) {
        this.name = name;
        if (price < 0) {
            System.out.println("Price can't be below zero, setting to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void increasePrice(float percent) {
        if (percent < 0) {
            System.out.println("Percentage can't be negative.");
            return;
        }
        this.price += this.price * (percent / 100);
    }

    public void decreasePrice(float percent) {
        if (percent < 0) {
            System.out.println("Percentage can't be negative.");
            return;
        }
        this.price -= this.price * (percent / 100);
        if (this.price < 0) {
            System.out.println("Price is below zero, setting to 0.");
            this.price = 0;
        }
    }

    public void getInfo() {
        System.out.println("Item: " + name + ", Price: $" + price);
    }
}
