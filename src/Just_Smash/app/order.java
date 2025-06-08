package Just_Smash.app;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class make_order {
    private int order_id;
    private String order_name;
    private int order_price;

    make_order(int order_id, String order_name, int order_price) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.order_price = order_price;
    }

    public int getorder_id() {
        return order_id;
    }

    public String getorder_name() {
        return order_name;
    }

    public int getorder_price() {
        return order_price;
    }

    public String toString() {
        return order_name + " " + order_id + " " + order_price;
    }
}

public class order {
    public static void main(String[] args) {

        List<make_order> c = new ArrayList<make_order>();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1- Add :");
            System.out.println("2- View :");
            System.out.println("3- Search :");
            System.out.println("4- Delete :");
            System.out.println("5- Update");
            System.out.println("0- Exit");
            System.out.println("enter your choice : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter order_ID : ");
                    int order_id = scan.nextInt();
                    System.out.println("enter order_Name : ");
                    scan.nextLine();
                    String order_name = scan.nextLine();
                    System.out.println("enter order_price :");
                    int order_price = scan.nextInt();

                    c.add(new make_order(order_id, order_name, order_price));
                    break;

                case 2:
                    System.out.println("-----------------------------------");
                    Iterator<make_order> iterator2= c.iterator();
                    while (iterator2.hasNext()) {
                        make_order e = iterator2.next();
                        System.out.println(e);
                    }
                    System.out.println("-----------------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("enter order_id to search : ");
                    int search_order_id = scan.nextInt();
                    System.out.println("-----------------------------------");
                    Iterator<make_order> iterator = c.iterator(); // Re-initialize iterator for searching
                    while (iterator.hasNext()) {
                        make_order e = iterator.next();
                        if (e.getorder_id() == search_order_id) {
                            System.out.println(e);
                            found = true;
                            break; 
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("-----------------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.println("enter order_id to Delete : ");
                    int Delete_order_id = scan.nextInt();
                    System.out.println("-----------------------------------");
                    Iterator<make_order> iterator4 = c.iterator(); // Re-initialize iterator for deleting
                    while (iterator4.hasNext()) {
                        make_order e = iterator4.next();
                        if (e.getorder_id() == Delete_order_id) {
                            iterator4.remove();
                            found = true;
                        }
                    } 
                    if (!found) {
                        System.out.println("Record not found ");
                    } else {
                        System.out.println("Record is Deleted Successfully ..! ");
                    }
                    System.out.println("-----------------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.println("enter order_id to update : ");
                    int update_order_id = scan.nextInt();
                    System.out.println("-----------------------------------");
                    ListIterator<make_order> iterator5 = c.listIterator();
                    while (iterator5.hasNext()) {
                        make_order e = iterator5.next();
                        if (e.getorder_id() == update_order_id) {
                            System.out.println("Enter new order_name: ");
                            order_name = scan.next();
                            System.out.println("Enter new order_price: ");
                            order_price = scan.nextInt();
                            iterator5.set(new make_order(update_order_id, order_name, order_price));
                            found = true;
                            break;
                        }
                    } 
                    if (!found) {
                        System.out.println("Record not found ");
                    } else {
                        System.out.println("Record is Updated Successfully ..! ");
                    }
                    System.out.println("-----------------------------------");
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);
    }
}
