package 多态;
interface usb{
    void powerOn();
    void powerOff();
}
class mouse implements usb{
    public void click(){

    }
    @Override
    public void powerOn() {
        System.out.println("连接鼠标...");
    }

    @Override
    public void powerOff() {

    }
}
class keyBoard implements usb{
    public void click(){

    }
    @Override
    public void powerOn() {
        System.out.println("连接键盘...");

    }

    @Override
    public void powerOff() {

    }
}

class computer{
    public void powerOn() {
        System.out.println("xiaoxie");
    }
    public void powerOff() {
        System.out.println("xiaoxie又写了");
    }
    public void openDevice(usb device){
        device.powerOn();
    }
}
public class test{
    public static void main(String[] args) {
//        computer c=new computer();
//        c.powerOn();
//        c.openDevice(new mouse());
//        c.openDevice(new keyBoard());
        usb v=new usb(){

            @Override
            public void powerOn() {
                System.out.println("new ");
            }

            @Override
            public void powerOff() {

            }
        };
        v.powerOn();

    }
}