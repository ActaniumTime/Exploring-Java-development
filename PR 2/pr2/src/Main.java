public class Main {
    public static void main(String[] args) {
        Cart cart1 = new Cart(5);

        Item item1 = new Item("Laptop", 1000);
        Item item2 = new Item("Phone", 500);
        Item item3 = new Item("Headphones", 150);
        Item item4 = new Item("Monitor", 300);
        Item item5 = new Item("Keyboard", 100);

        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.addItem(item3);
        cart1.addItem(item4);
        cart1.addItem(item5);

        System.out.println("Total price: $" + cart1.totalPrice());

        cart1.increasePrices(15);
        System.out.println("Total price after 15% increase: $" + cart1.totalPrice());

        cart1.decreasePrices(30);
        System.out.println("Total price after 30% decrease: $" + cart1.totalPrice());
    }
}