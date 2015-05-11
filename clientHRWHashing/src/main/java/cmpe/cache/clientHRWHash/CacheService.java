package cmpe.cache.clientHRWHash;

public interface CacheService {
    public String get(long key);

    public void put(long key, String value);
}
