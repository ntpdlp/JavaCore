package basic.map_hashmap_hashtable_linkedhashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void printMyHashMap(Map<Integer,String> map){
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<Integer,String> myHashMap = new HashMap<Integer,String>();
        myHashMap.put(1,"Java");
        myHashMap.put(2,"Javascript");
        myHashMap.put(3,"Selenium");
        myHashMap.put(4,"Selenide");
        myHashMap.put(5,"Mocha");
        printMyHashMap(myHashMap);
    }


}
