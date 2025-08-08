public class kadanes {
    public static int kadanes_algo(int num[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        boolean allnum=true;
        int maxneg = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){

            if(num[i]>=0){
                allnum=false;
            }else{
                maxneg = Math.max(num[i],maxneg);
            }
            cs = cs + num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        return allnum ? maxneg : ms;
    }
    public static void main(String[] args) {
        int num[]= {-2,-1,-3,-9,-7};
        int sum =kadanes_algo(num);
        System.out.println(sum);
    }
}
