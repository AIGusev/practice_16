package practice_16.z2;

public class MovVideoAdapter implements VideoAdapter {
    @Override
    public boolean supports(String format) {
        return format.equalsIgnoreCase("mov");
    }

    @Override
    public Video convert(String path) {
        System.out.println("Конвертация MOV → MP4: " + path);
        return new Video("mov-" + System.currentTimeMillis(), path, "MP4");
    }
}
