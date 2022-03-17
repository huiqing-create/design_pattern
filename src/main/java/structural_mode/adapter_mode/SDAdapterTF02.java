package structural_mode.adapter_mode;

/**
 * 对象适配器模式
 */
public class SDAdapterTF02 implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF02(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
