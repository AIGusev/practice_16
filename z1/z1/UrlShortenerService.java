package practice_16.z1;

public class UrlShortenerService {

    private final ShorteningStrategy strategy;
    private final UrlStorage storage;

    public UrlShortenerService(ShorteningStrategy strategy) {
        this.strategy = strategy;
        this.storage = MemoryUrlStorage.getInstance();
    }

    public String shortUrl(String longUrl) {
        String shortUrl = strategy.shorten(longUrl);
        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return storage.getLongUrl(shortUrl);
    }
}
