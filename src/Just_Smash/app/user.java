package Just_Smash.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user {
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        manageUsers();
    }

    private static void manageUsers() {
        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    viewUsers();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addUser() {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String ID = scanner.nextLine();
        User newUser = new User(name, ID);
        users.add(newUser);
        System.out.println("User added successfully.");
    }

    private static void viewUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", ID: " + user.getID());
        }
    }

    private static void updateUser() {
        System.out.print("Enter user ID to update: ");
        String ID = scanner.nextLine();
        for (User user : users) {
            if (user.getID().equals(ID)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                user.setName(newName);
                System.out.println("User updated successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    private static void deleteUser() {
        System.out.print("Enter user ID to delete: ");
        String ID = scanner.nextLine();
        for (User user : users) {
            if (user.getID().equals(ID)) {
                users.remove(user);
                System.out.println("User deleted successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }
}

class User {
    private String name;
    private String ID;

    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
