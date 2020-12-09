import java.net.URL;

public class validClassLoader {
    public static void main(String[] args) {
        //获取bootstrapclassloader能够加载的api路径
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for(URL element : urls){
            System.out.println(element.toExternalForm());
        }

        System.out.println(Long.class.getClassLoader());
        String extDirs=System.getProperty("java.ext.dirs");
        for(String path :extDirs.split(":")){
            System.out.println(path);
        }
    }
}
