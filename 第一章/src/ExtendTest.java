import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;

import java.util.*;

abstract  class Person{
    Person(){this.account=new Double(0);}
    Person(double account){this.account=new Double(account);}
    protected Double account;
    @Override
    public String toString() {
        return "Person{" +
                "account=" + account +
                '}';
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}
class master extends Person{
    master(){}
    master(double account){
        super(account);
    }
    public Boolean reduce(Double account){
        if(account>this.account)return false;
        this.account-=account;
        return true;
    }

    /***
     * 发红包
     * @param account :发送的金额
     * @param count :发送的人数 ,尽量不要以类为参数,这样写死了,如果改一个对其他类发红包的需求呢
     * @return 发的金额列表
     */
    public ArrayList<Double> send(double account,int count){
       Random random=new Random();
       ArrayList<Double> res=new ArrayList<Double>();
       double sum=account;
       double money;
       for(int i=0;i<count-1;++i){
           do{
               money=random.nextDouble();
           }while((sum-money*sum)/(count-i)<=0);
           res.add(money*sum);
           sum-=money*sum;
       }
       res.add(sum);
       return res;
    }
}
class other extends Person{
    other(){}
    other(double account){
        super(account);
    }
    public void add(Double account){
        this.account+=account;
    }

    /***
     * 收到的金额
     * @param account
     */
    public void receive(double account){
        add(account);
    }
}
/***
 * 发红包,n , m  x+m*y=z y>0 (z-x)/m>0 x
 *
 */

public class ExtendTest {
    public static void main(String[] args) {
       master m= new master(10);
       ArrayList<other> others=new ArrayList<>();
       for(int i=0;i<5;++i)
           others.add(new other(0));
        ArrayList<Double> distributes = m.send(10, 5);
        for(int i=0;i<5;++i){
            others.get(i).add(distributes.get(i));
            System.out.println(others.get(i));
        }

    }
}
