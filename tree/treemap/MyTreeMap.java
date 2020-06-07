package basic.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> friends = new TreeMap<>();
        friends.put("Vo",new Integer(39));
        friends.put("Adnan",new Integer(45));
        friends.put("Quynh",new Integer(28));
        friends.put("Alex",new Integer(15));

        System.out.println("Default TreeMap sorted: " + friends);

        Set setFriends = friends.entrySet();
        Iterator it = setFriends.iterator();
        while(it.hasNext()){
            Map.Entry current = (Map.Entry)it.next();
            System.out.print(current.getKey() + ": ");
            System.out.println(current.getValue());
        }
    }
}
