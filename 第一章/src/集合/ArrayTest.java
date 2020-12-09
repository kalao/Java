package 集合;
import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("apple");
        a.forEach((b)-> System.out.println(b));
    }
}
