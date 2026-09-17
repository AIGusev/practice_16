package practice_16.z1;

public class Main {
    static void main(String[] args) {
        UrlShortenerService urlShortenerService = new UrlShortenerService(new ShortenerFactory(new Base62Strategy()));

        String shortUrl = urlShortenerService.shortUrl("https://lonrurl.com/long/long");
        System.out.println("Short URL: " + shortUrl);

        String longUrl = urlShortenerService.expandUrl(shortUrl);
        System.out.println("Long URL: " + longUrl);
    }
}
