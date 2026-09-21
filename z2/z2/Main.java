package practice_16.z2;

public class Main {
    public static void main(String[] args) {

        VideoService videoService = new VideoService(
                new AviVideoAdapter(),
                new MovVideoAdapter(),
                new WmvVideoAdapter()
        );

        Video video = videoService.uploadVideo("C:Видео", "avi");

        videoService.streamVideo(video.getId());

        System.out.println(video.getId());
    }
}