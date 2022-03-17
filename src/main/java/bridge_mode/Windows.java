package bridge_mode;

public class Windows extends OperatingSystemVersion {


    /**
     * 父类中构造函数是有参的，子类中也要有参
     */


    public Windows(VideoFile videoFile) {
        //super是调用父类的构造函数
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
