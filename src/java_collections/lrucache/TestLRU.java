package java_collections.lrucache;


import java.util.Map;

public class TestLRU {

    public static void main(String[] args) {
        LRUcache<String,Integer> lrUcache = new LRUcache<>(3);
        lrUcache.put("A",1);
        lrUcache.put("B",2);
        lrUcache.put("C",3);
        lrUcache.get("B");
        lrUcache.put("D",4);
        System.out.println(lrUcache.keySet());
        for(Map.Entry<String,Integer> entry: lrUcache.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
}