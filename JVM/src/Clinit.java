public class Clinit {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName()+"开始");
            new DeadThread();
            System.out.println(Thread.currentThread().getName()+"结束");
        };
        Thread t1=new Thread(r,"线程一");
        Thread t2=new Thread(r,"线程二");
        t1.start();
        t2.start();
    }
}
class DeadThread{
    static {
        if(true){
            System.out.println("hi");
            while(true){}//clint会加锁
        }
    }
}
