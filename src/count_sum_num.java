public class count_sum_num {

    public static void main(String[] args) {
        System.out.println(sum1(36));
    }

    public static int sum1(int n) {
        int s=0;
        for (int i=0; i<=n; i++) {
            s += i;
            System.out.println("i:"+i+" s:"+s+" n:"+n);
        }
        return s;
    }
}
