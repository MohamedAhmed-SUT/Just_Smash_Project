package Just_Smash.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class item {
    private static List<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        manageItems();
    }

    private static void manageItems() {
        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewItems();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter item description: ");
        String description = scanner.nextLine();
        Item newItem = new Item(name, price, quantity, description);
        items.add(newItem);
        System.out.println("Item added successfully.");
    }

    private static void viewItems() {
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Description: " + item.getDescription());
        }
    }

    private static void updateItem() {
        System.out.print("Enter item name to update: ");
        String name = scanner.nextLine();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                item.setPrice(newPrice);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void deleteItem() {
        System.out.print("Enter item name to delete: ");
        String name = scanner.nextLine();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                items.remove(item);
                System.out.println("Item deleted successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}

class Item {
    private String name;
    private double price;
    private int quantity;
    private String description;

    public Item(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
