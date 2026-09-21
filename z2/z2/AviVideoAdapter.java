package practice_16.z2;

public class AviVideoAdapter implements VideoAdapter{
    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("avi");
    }

    @Override
    public Video convert(String path) {
        System.out.println("Конвертация AVI → MP4: " + path);
        return new Video("avi-" + System.currentTimeMillis(), path, "MP4");
    }
}
