package edu.sjsu.cmpe.cache.clientConsistentHash;


public interface CacheService {
    public String get(long key);

    public void put(long key, String value);
}
