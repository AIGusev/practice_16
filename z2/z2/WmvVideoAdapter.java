package practice_16.z2;

public class WmvVideoAdapter implements VideoAdapter{
    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("wmv");
    }

    @Override
    public Video convert(String path) {
        System.out.println("Конвертация WMV → MP4: " + path);
        return new Video("wmv-" + System.currentTimeMillis(), path, "MP4");
    }
}
