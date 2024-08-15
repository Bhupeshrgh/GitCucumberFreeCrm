package programspractice;

import java.util.*;

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    static Map<String, Item> items = new HashMap<>();
    static Map<String, Integer> cart = new HashMap<>();

    public static void main(String[] args) {
        // Add items to the catalog
        items.put("Apple", new Item("Apple", 0.99));
        items.put("Banana", new Item("Banana", 0.59));
        items.put("Orange", new Item("Orange", 1.29));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addItemToCart(scanner);
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    static void addItemToCart(Scanner scanner) {
        System.out.print("Enter item name: ");
        String itemName = scanner.next().toUpperCase();

        if (items.containsKey(itemName)) {
            if (cart.containsKey(itemName)) {
                cart.put(itemName, cart.get(itemName) + 1);
            } else {
                cart.put(itemName, 1);
            }
            System.out.println(itemName + " added to cart.");
        } else {
            System.out.println("Item not found. Please try again.");
        }
    }

    static void viewCart() {
        System.out.println("Shopping Cart:");
        double total = 0;

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            double price = items.get(itemName).price;

            System.out.println(itemName + " x " + quantity + " = $" + (price * quantity));
            total += price * quantity;
        }

        System.out.println("Total: $" + total);
    }

    static void checkout() {
        viewCart();
        cart.clear();
        System.out.println("Thank you for shopping with us!");
    }
}
