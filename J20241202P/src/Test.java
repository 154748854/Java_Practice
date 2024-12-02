import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //求斐波那契数列的第n项。(迭代实现)
        int n = 40;
        int ret = fib(n);

    }
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }




    public static void mainP2(String[] args) {
        //求1！+2！+3！+4！+........+n!的和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n == 1) {
                System.out.println(1);
            }
            System.out.println(jc(1) + jc(n-1));
        }
    }
    //求出阶乘
    public static int jc(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            c *= i;
        }
        return c;
    }


    public static void mainP1(String[] args) {
        //求 N 的阶乘
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = jc(n);
        System.out.println(ret);
    }



    //失败
   /* public static void main(String[] args) {
        //使用函数求最大值
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ret = max2(a,b);
        max3(ret,c);
    }
    //创建方法比较两个数
    public static int max2(int a,int b) {
        if(a > b) {
            return a;
        } else if (a < b) {
            return b;
        }else {
            System.out.println("相等");
            return 0;
        }
    }
    public static int max3(int c) {
       if(max2() > c) {

       }
    }*/
}

