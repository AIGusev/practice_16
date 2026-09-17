package practice_16.z1;

public class ShortenerFactory {

    private final ShorteningStrategy strategy;

    public ShortenerFactory(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public ShorteningStrategy getStrategy() {
        return strategy;
    }
}
