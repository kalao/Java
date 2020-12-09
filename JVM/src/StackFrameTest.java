public class StackFrameTest {
    public static void method1(){
        int x=1;
        System.out.println("start method1");
        method2();
        System.out.println("end method1");

    }
    public static void method2(){
        System.out.println("start method2");
        method3();
        System.out.println("end method2");

    }
    public void fun1(){
        String value="ddd";
        value="55";
    }
    public void fun(){
        int a=0;
        {
            int b=0;
            b=a+1;

        }
        int c=a+1;
    }
    public static void method3(){
        System.out.println("start method3");
//        int i=1/0;
        System.out.println("end method3");

    }
    public static void main(String[] args) {
        System.out.println("start main");

        try{
            method1();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end main");

    }
}
