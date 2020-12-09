public class StackOverTest {
    /***
     * 默认情况是 count:10777
     * 设置栈的大小(run->Edit COnfigurations->Application->VM options) -Xss256k count:1825
     */
    private static int count=1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
