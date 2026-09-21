package practice_16.z2;

public interface VideoAdapter {

    boolean supports(String format);
    Video convert(String path);
}
