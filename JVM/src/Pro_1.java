import java.util.*;

public class Pro_1 {

    public static List<String> docs=new ArrayList<>();
    public static List<List<String>> keywords=new ArrayList<>(new ArrayList<>());
    public static Map<String,ArrayList<Integer>> result;
    public static Scanner input=new Scanner(System.in);
    static {
        docs.add("I like to watch the sun set with my friend.");
        docs.add("The Best Places To Watch The Sunset.");
        docs.add("My friend watch the sun come up.");
        for(String doc :docs){
            String DOC=doc.toLowerCase();
            String [] res=DOC.split("\\W+");//和python的不一样
            ArrayList<String> tmp=new ArrayList<String>();
            for(String r:res){
                tmp.add(r);
            }
            keywords.add(tmp);
        }
    }
    public static Map<String, ArrayList<Integer>> dataMapping(){
        Map<String,ArrayList<Integer>> result=new HashMap<>();
        Iterator<List<String>> iterator = keywords.iterator();
        Integer index=0;
        while(iterator.hasNext()){
            index++;
            for(String word:iterator.next()){
                if(result.containsKey(word)){
                    result.get(word).add(index);
                }else {
                    result.put(word, new ArrayList<>());
                    result.get(word).add(index);
                }
            }
        }
        System.out.println("总共"+result.keySet().size());
        for(String s:result.keySet()){
            System.out.println(s);
            ArrayList<Integer> docs=result.get(s);
            for(Integer doc:docs){
                System.out.print(doc+" ");
            }
            System.out.println();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(docs);
        result=dataMapping();
        System.out.println("请输入关键词....");
        String key=input.next();
        if(result.containsKey(key)){
            ArrayList<Integer> res=result.get(key);
            for(Integer id:res){
                System.out.println(id);
            }
        }else{
            System.out.println("NONE");
        }

    }

}
