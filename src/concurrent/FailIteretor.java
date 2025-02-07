package concurrent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailIteretor {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("s");
        list.add("b");
        list.add("c");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            list.add("d");
        }

        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"Sagar");
        map.put(2,"Sagar");
        map.put(3,"Sagar");
        Iterator itm = map.entrySet().iterator();
        while (itm.hasNext()){
            System.out.println(itm.next());
            map.put(4,"Manu");
        }
    }


}
