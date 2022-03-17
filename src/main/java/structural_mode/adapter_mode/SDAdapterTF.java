package structural_mode.adapter_mode;

/**
 * 类适配器模式
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "tf card read msg : hello word tf card";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
