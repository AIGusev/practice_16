package practice_16.z2;

import java.util.ArrayList;
import java.util.List;

public class VideoService {

    private VideoAdapter aviAdapter;
    private VideoAdapter movAdapter;
    private VideoAdapter wmvAdapter;

    private final List<VideoAdapter> adapters = new ArrayList<>();
    private final List<Video> videos = new ArrayList<>();

    public VideoService(VideoAdapter aviVideoAdapter, VideoAdapter movVideoAdapter, VideoAdapter wmvVideoAdapter) {
        this.aviAdapter = aviVideoAdapter;
        this.movAdapter = movVideoAdapter;
        this.wmvAdapter = wmvVideoAdapter;
    }

    public Video uploadVideo(String path, String format) {
        System.out.println("Загрузка видео " + path);
        Video video = null;
        if (format.equals("avi")) {
            video = aviAdapter.convert(path);
        } else if (format.equals("mov")) {
            video = movAdapter.convert(path);
        } else if (format.equals("wmv")) {
            video = wmvAdapter.convert(path);
        }
        return video;
    }

    public String streamVideo(String id) {
        System.out.println("Идет видео" + id);
        return id;
    }

    }
