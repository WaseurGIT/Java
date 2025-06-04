import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsertionDeletion {

    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40));
        
        int pos = 2;
        int posElement = 15;

        int firstElement = 5;
        int lastElement = 50;
        

        int target = 2;

        int i;

        System.out.println("Before insertion: ");
        for(i=0;i<arr.size();i++){
            System.out.println(" "+arr.get(i));
        }

        // firstly it place 15 at index 1 then place the other values 
        arr.add(pos-1,posElement);

        // at start
        arr.add(0,firstElement);

        // et end
        arr.add(arr.size(),lastElement);

        // 
        System.out.println("After insertion:");
        for(i=0;i<arr.size();i++){
            System.out.println(" "+arr.get(i));
        }

        // reverse traversal
        System.out.println("Reverse traversal: ");
        for(i = arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
        }

        // deletion
        arr.remove(target);
        System.out.println("After Delete:");
        for(i=0;i<arr.size();i++){
            System.out.println(" "+arr.get(i));
        }
        
    }
}