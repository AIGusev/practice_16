package practice_16.z1;

public class UrlShortenerService {

    private final ShortenerFactory factory;

    private final UrlStorage storage;

    public UrlShortenerService(ShortenerFactory factory) {
        this.factory = factory;
        this.storage = MemoryUrlStorage.getInstance();
    }

    public String shortUrl(String longUrl) {
        String shortUrl = factory.getStrategy().shorten(longUrl);
        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return storage.getLongUrl(shortUrl);
    }
}
