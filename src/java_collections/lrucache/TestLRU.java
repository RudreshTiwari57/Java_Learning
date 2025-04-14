package java_collections.lrucache;

import java.util.Map;

public class TestLRU {
    public static void main(String[] args) {
        LRUcache<Integer,String> lrUcache = new LRUcache<>(4);
        lrUcache.put(1,"A");
        lrUcache.put(2,"B");
        lrUcache.put(3,"C");

        lrUcache.get(1);
        lrUcache.put(4,"D");
        lrUcache.put(5,"E");
        for(Map.Entry<Integer, String> entry:lrUcache.entrySet())
        {
            System.out.println(entry.getValue());
        }

    }
}
