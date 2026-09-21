package practice_16.z1;

public class ShortenerFactory {

    public static ShorteningStrategy create(String type) {
        if (type.equalsIgnoreCase("base62")) {
            return new Base62Strategy();
        } else if (type.equalsIgnoreCase("hash")) {
            return new HashStrategy();
        }
        throw new IllegalArgumentException("Неизвестная стратегия: " + type);
    }
}
