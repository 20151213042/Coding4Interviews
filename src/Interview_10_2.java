
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class Interview_10_2 {

    public int numWays(int n) {
        if(n == 0){
            return 1;
        }
        if(n <= 2){
            return n;
        }
        int num1 = 1;
        int num2 = 2;
        int num3 = 0;
        for(int i = 1; i < n - 1;i++){
            num3 = (num1 + num2) % 1000000007;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}
