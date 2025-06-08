package Just_Smash.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class pay_payment{
    private String item_payment;
    private int num_payment ;
    private int price ;

    pay_payment (String item_payment , int num_payment , int price){
        this.item_payment = item_payment ;
        this.num_payment = num_payment ; 
        this.price = price ;

    }
    public String getitem_payment (){
        return item_payment;
    }
    public int getnum_payment(){
        return num_payment;
    }

    public int getprice(){
        return price;
    }
    public String toString(){
        return item_payment+""+num_payment+""+ price;
    }
}

public class pay {


    public static void main(String[] args){


        List<pay_payment> c = new ArrayList<pay_payment>();
        Scanner scan = new Scanner(System.in);
        int choice ;
        do{
            System.out.println("1.Add : ");
            System.out.println("2.View : ");
            System.out.println("3.Search : ");
            System.out.println("4.Delet : ");
            System.out.println("5. Update : ");
            System.out.println("0.Exit : ");
            System.out.println("enter your choice :");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                System.out.println("enter item_payment : ");
                int item_payment = scan.nextInt();
                System.out.println("enter num_payment :");
                scan.nextLine();
                int num_payment = scan.nextInt();
                System.out.println("enter price :");
                int price = scan.nextInt();

                c.add(new pay_payment(null, num_payment, price));
                    
                    break;

                case 2 :
                System.out.println("--------------------------------");
                Iterator<pay_payment>iterator2 = c.iterator();
                while (iterator2.hasNext()){
                    pay_payment e = iterator2.next();
                    System.out.println(e);

                }   
                System.out.println("-----------------------------------");
                break;

                case 3 :
                boolean found = false ; 
                System.out.println("enter num_payment to search : ");
                int search_num_payment = scan.nextInt();
                System.out.println("--------------------------------");
                Iterator<pay_payment>iterator4 = c.iterator();
                while (iterator4.hasNext()){
                    pay_payment e = iterator4.next();
                    if (e.getnum_payment() == search_num_payment){
                    System.out.println(e);
                    found = true ;
                    break;
                    }
                }
                if (!found) {
                    System.out.println("Record not found");
                }
                System.out.println("-----------------------------------");
                break;




 
            
                default:
                    break;
            }




        }while (choice != 0);

    }
}