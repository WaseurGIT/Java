import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,List<Integer>> map = new HashMap<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(85);
        list1.add(90);
        list1.add(78);

        List<Integer> list2 = new ArrayList<>();
        list2.add(92);
        list2.add(88);

        map.put("Alice", list1);
        map.put("Bob", list2);
        System.out.println(map);
        sc.close();
    }
}