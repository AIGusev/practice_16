package practice_16.z1;

import java.util.HashMap;
import java.util.Map;

public class MemoryUrlStorage implements UrlStorage{

    private static final MemoryUrlStorage INSTANCE = new MemoryUrlStorage();
    private final Map<String, String> storage = new HashMap<>();

    private MemoryUrlStorage() {
    }

    public static MemoryUrlStorage getInstance() {
        return INSTANCE;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        storage.put(shortUrl, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        return storage.get(shortUrl);
    }
}
