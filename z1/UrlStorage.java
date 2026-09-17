package practice_16.z1;

public interface UrlStorage {
    void save(String shortUrl, String longUrl);
    String getLongUrl(String shortUrl);
}
