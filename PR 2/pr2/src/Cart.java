public class Cart {
    private Item[] stack;
    private int top;
    private int maxSize;

    public Cart(int size) {
        this.maxSize = size;
        this.stack = new Item[size];
        this.top = -1;  // стек спочатку порожній
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("Cart is full, can't add more items.");
        } else {
            stack[++top] = item;
            System.out.println("Added item: " + item.name + ", Price: $" + item.price);
        }
    }

    public Item removeItem() {
        if (isEmpty()) {
            System.out.println("Cart is empty, nothing to remove.");
            return null;
        } else {
            System.out.println("Removed item: " + stack[top].name);
            return stack[top--];
        }
    }

    public float totalPrice() {
        if (isEmpty()) {
            System.out.println("Cart is empty.");
            return 0;
        }

        float total = 0;
        for (int i = 0; i <= top; i++) {
            total += stack[i].price;
        }
        return total;
    }

    public void increasePrices(float percent) {
        if (isEmpty()) {
            System.out.println("Cart is empty, nothing to increase.");
            return;
        }

        for (int i = 0; i <= top; i++) {
            stack[i].increasePrice(percent);
            System.out.println("Increased price of " + stack[i].name + " by " + percent + "%");
        }
    }

    public void decreasePrices(float percent) {
        if (isEmpty()) {
            System.out.println("Cart is empty, nothing to decrease.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            stack[i].decreasePrice(percent);
            System.out.println("Decreased price of " + stack[i].name + " by " + percent + "%");
        }
    }
}
