package bridge_mode;

public class Mac extends OperatingSystemVersion{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
