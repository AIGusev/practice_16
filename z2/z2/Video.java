package practice_16.z2;

public class Video {

    private String id;
    private String path;
    private String format;

    public Video(String id, String path, String format) {
        this.id = id;
        this.path = path;
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", path='" + path + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
