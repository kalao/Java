import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

public class CustomClassLoader extends ClassLoader {
    protected Class<?> findClass(String name) throws ClassNotFoundException {
            byte[] result=getClassFromCustomPath(name);
            if(result==null){
                throw new ClassNotFoundException();
            }else{
                return defineClass(name,result,0,result.length);
            }
    }
    public static byte[] getClassFromCustomPath(String name){
        //这里需要对源码进行解密的操作
        return null;
    }
    public static void main(String[] args) {
    }
}
