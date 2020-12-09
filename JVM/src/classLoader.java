public class classLoader {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemLoader= ClassLoader.getSystemClassLoader();
        System.out.println(systemLoader);
        //获取系统类加载器的上层:扩展类加载器
        ClassLoader exClassLoader=systemLoader.getParent();
        System.out.println(exClassLoader);
        //获得bootstrapClassLoader
        ClassLoader bootstrapClassLoader =exClassLoader.getParent();
        System.out.println(bootstrapClassLoader);
        //获取用户自定义类的classloader,默认是系统加载器
        ClassLoader userClassLoader=classLoader.class.getClassLoader();
        System.out.println(userClassLoader);
        //String类的classloader,是bootstraploader---->java的核心类库都是用bootstrap类加载器加载的
        ClassLoader stringClassLoader=String.class.getClassLoader();
        System.out.println(stringClassLoader);

    }
}
