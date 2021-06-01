
/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *
 */

public class Interview_10_1 {

    public static int fib(int n) {
        int fib0 = 0;
        int fib1 = 1;
        if(n <= 1){
            return n;
        }
        int fib2 = 0;
        for(int i = 0; i < n -1;i++){
            fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }
        return fib2;
    }

    public static void main(String[] args){
        System.out.println(fib(3));
    }
}
