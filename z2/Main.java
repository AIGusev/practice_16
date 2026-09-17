package practice_16.z2;

public class Main {
    static void main(String[] args) {

        VideoService videoService = new VideoService(new AviVideoAdapter(), new MovVideoAdapter(), new WmvVideoAdapter());

    Video video = videoService.uploadVideo("C:Видео", "avi");

    videoService.streamVideo(video.getId());

        System.out.println(video.getId());
    }

}

//Мне ИИшка немного помогла сделать это задание, а именно ВидеоСервис. Но тут у меня не очень получается.
