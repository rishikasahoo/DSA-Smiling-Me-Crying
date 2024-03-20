import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String args[]){
        //Map<String, Integer> numbers = new HashMap<>(); T.C-O(n)
        Map<String, Integer> numbers = new TreeMap<>();// prints in sorted order T.C- O(log n)
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3); // keys should be unique
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.remove("Three");
        //numbers.put("Two", 23); // Won't allow you to again use the same key, the string is the key, even after having different integer valyue
        // if you do not wish to print a particular value for the same key then
        //if(!numbers.containsKey("Two")){  // method-1
        //    numbers.put("Two", 23);
        //}
        numbers.putIfAbsent("Two", 23);  // method -2
        System.out.println(numbers);
        System.out.println(numbers.containsValue(3)); // to check whether a particular value is +nt or not, same way can use contains.Key to check whether a key is +nt or not
        System.out.println(numbers.isEmpty()); // to check whether this map is empty or not

        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);  // all entries getting printed

            System.out.println(e.getKey()); // then key is getting printed
            System.out.println(e.getValue()); // then values is getting printed
        }
        for(String key: numbers.keySet()){  // to print only the keys set
            System.out.println(key);
        }

        for(Integer value: numbers.values()){ // to only print the values
            System.out.println(value);
        }




    }
}
