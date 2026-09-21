package practice_16.z2;

import java.util.ArrayList;
import java.util.List;

public class VideoService {

    private final List<VideoAdapter> adapters = new ArrayList<>();
    private final List<Video> videos = new ArrayList<>();

    public VideoService(VideoAdapter aviVideoAdapter,
                        VideoAdapter movVideoAdapter,
                        VideoAdapter wmvVideoAdapter) {
        this.adapters.add(aviVideoAdapter);
        this.adapters.add(movVideoAdapter);
        this.adapters.add(wmvVideoAdapter);
    }

    public Video uploadVideo(String path, String format) {
        System.out.println("Загрузка видео " + path);
        Video video = null;
        for (VideoAdapter adapter : adapters) {
            if (adapter.supports(format)) {
                return adapter.convert(path);
            }
        }
        return null;
    }

    public String streamVideo(String id) {
        System.out.println("Идет видео" + id);
        return id;
    }

    }
