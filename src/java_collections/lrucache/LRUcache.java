package java_collections.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUcache<K,V> extends LinkedHashMap <K,V>
{
    private final int cap;
    public LRUcache(int cap)
    {
        super(cap,0.75f,true);
        this.cap = cap;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> entry)
    {
        return size()>cap;
    }
}
