/* Task 05
Implement the design of the UberEats class so that the following output is produced:
Hint: For simplicity, you can assume that a customer will always order exact 2 items.

Output:
Shakib, welcome to UberEats!
=========================
=========================
User Details: Name: Shakib, Phone: 01719658xxx, Address: Mohakhali
Orders: {'Burger': 220, 'Coca Cola': 50}
Total Paid Amount: 270
=========================
Siam, welcome to UberEats!
=========================
=========================
User Details: Name: Siam, Phone: 01719659xxx, Address: Uttara
Orders: {'Pineapple': 80, 'Dairy Milk': 70}
Total Paid Amount: 150
*/

public class UberEats {
    String name, address, mobile, item1, item2;
    int price1, price2, T;

    public UberEats(String name, String mobile, String address) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        System.out.println(name + ", welcome to UberEats!");
    }

    public void add_items(String item1, String item2, int price1, int price2) {
        this.item1 = item1;
        this.item2 = item2;
        this.price1 = price1;
        this.price2 = price2;
    }

    public void print_order_detail() {
        T = price1 + price2;
        System.out.println("User Details: Name: " + name + ", Phone: " + mobile + ", Address: " + address);
        System.out.println("Orders: {'" + item1 + "': " + price1 + ", '" + item2 + "': " + price2 + "}");
        System.out.println("Total Paid Amount: " + T);
    }

    public static void main(String[] args) {
        UberEats order1 = new UberEats("Shakib", "01719658xxx", "Mohakhali");
        System.out.println("=========================");
        order1.add_items("Burger", "Coca Cola", 220, 50);
        System.out.println("=========================");
        order1.print_order_detail();
        System.out.println("=========================");
        UberEats order2 = new UberEats("Siam", "01719659xxx", "Uttara");
        System.out.println("=========================");
        order2.add_items("Pineapple", "Dairy Milk", 80, 70);
        System.out.println("=========================");
        order2.print_order_detail();
    }
}
