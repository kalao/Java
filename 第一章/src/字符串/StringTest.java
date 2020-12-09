package 字符串;

import java.util.Arrays;
import java.util.Random;
class A{
    A(){

    }
    A(int x){

    }
}
public class StringTest extends  A {
    StringTest(int x){
//        super(1);
    }
    public static void main(String[] args) {
        String line="qwertyuiopasdfghjklzxcvbnm";
        Random random=new Random();
        String str="";
        for(int i=0;i<line.length();++i) str=str+line.charAt(random.nextInt(line.length()));
        System.out.println(str);
        char[] strChars=str.toCharArray();
        Arrays.sort(strChars);
        System.out.println(Arrays
                .toString(strChars)
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .replace(" ","")
        );



    }
}
