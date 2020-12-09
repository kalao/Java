interface F{
    public void fun();
}
public class invokeDynamic {
    public static void main(String[] args) {
        F f=()->{
            System.out.println("1");
        };
        f.fun();
    }

}
