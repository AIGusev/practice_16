package practice_16.z1;

import java.util.Random;

public class Base62Strategy implements ShorteningStrategy{


    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private final Random random = new Random();

    @Override
    public String shorten(String longUrl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }
        return stringBuilder.toString();
    }
}
