import java.util.HashMap;

public class HashMap_1 {

    public static void main(String[] args) {
        //put: to insert data, get:  to retrieve data
        HashMap<Integer, String> customer = new HashMap<Integer, String>();

        customer.put(101, "CSE");
        customer.put(102, "Civil");
        customer.put(103, "EEE");
        System.out.println(customer.get(101));
        System.out.println(customer.get(101));
        System.out.println(customer.get(103));

    }
    
}