import java.util.HashSet;

public class HashSet_1 {

    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();

        fruitsName.add("Mango");
        fruitsName.add("Apple");
        fruitsName.add("banana");

        System.out.println(fruitsName);
        System.out.println("Size : "+fruitsName.size());
    
        fruitsName.remove("banana");
        System.out.println(fruitsName);

        fruitsName.clear();
        System.out.println(fruitsName);

        System.out.println(fruitsName.isEmpty());

        HashSet<Integer> value = new HashSet<Integer>();

        value.add(12);
        value.add(54);
        value.add(87);
        value.add(86);

        System.out.println(value);
        System.out.println("Size: "+value.size());

    }
}