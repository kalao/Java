public class XsystemToXsystem {
    /***
     *
     * @param x
     * @param sys_source 2 8 16
     * @param sys_target 2 8 16
     * @return
     */
    public static String translate(String x,int sys_source,int sys_target){
        //1 得到十进制数
        //2 将其转为target进制
        char[] tx=x.toCharArray();
        int sum=0;
        for (int i = 0,j=1; i < tx.length; i++,j*=sys_source) {

            if(tx[tx.length-i-1]>='A'){
                sum+=(10+(tx[tx.length-i-1]-'A'))*j;
            }else{
                sum+=(tx[tx.length-i-1]-'0')*j;
            }
        }
        char[] res=new char[tx.length];

        int count=0;
        while(sum>0){
            int t=sum%sys_target;
            if(t>=10){
                res[count++]=(char)(t-10+'A');
            }else{
                res[count++]=(char)(t+'0');
            }
            sum-=(t);
            sum/=sys_target;

        }
        char[] rres=new char[count+1];
        for(int i=0;i<count;++i){
//            char t=res[i];
//            res[i]=res[count-i-1];
//            res[count-i-1]=t;
            rres[count-i-1]=res[i];
        }
        rres[count]='\n';
        return String.valueOf(rres);
    }
    public static void main(String[] args) {
        System.out.println(translate("10101", 2, 8));
    }
}
