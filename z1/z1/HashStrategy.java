package practice_16.z1;

public class HashStrategy implements ShorteningStrategy{



    @Override
    public String shorten(String longUrl) {
        int hash = longUrl.hashCode();
        return Integer.toHexString(Math.abs(hash));
    }
}
