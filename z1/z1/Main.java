package practice_16.z1;

public class Main {
     static void main(String[] args) {

        // Фабрика создаёт стратегию по имени
        ShorteningStrategy strategy = ShortenerFactory.create("base62");

        UrlShortenerService service = new UrlShortenerService(strategy);

        String shortUrl = service.shortUrl("https://longurl.com/long/long");
        System.out.println("Short URL: " + shortUrl);

        String longUrl = service.expandUrl(shortUrl);
        System.out.println("Long URL: " + longUrl);
    }
}
