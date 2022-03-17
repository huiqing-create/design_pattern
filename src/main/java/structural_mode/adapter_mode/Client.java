package structural_mode.adapter_mode;


/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String s1 = computer.readSD(sdCard);
        System.out.println(s1);
        System.out.println("------------");
//        SDAdapterTF adapter = new SDAdapterTF();
        TFCardImpl tfCard = new TFCardImpl();
        SDAdapterTF02 adapter = new SDAdapterTF02(tfCard);
        String s = computer.readSD(adapter);
        System.out.println(s);
    }
}
