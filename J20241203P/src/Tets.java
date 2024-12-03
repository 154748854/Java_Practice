import java.util.Scanner;

public class Tets {
    public static void mainP1(String[] args) {
        //使用函数求最大值
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max3(a, b, c));
    }
    public static int max2(int a,int b) {
        int ret = 0;
        if(a > b) {
            ret = a;
        }else if(a < b) {
            ret = b;
        }
        return ret;
    }
    public static int max3(int a,int b,int c) {
        return max2(max2(1,b),c);
    }

    public static void mainP2(String[] args) {
        //求 N 的阶乘
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(jc(n));
    }

    public static int jc(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
    /*public static double max2(double a,double b) {
        if(a > b) {
            return a;
        }else if(a < b) {
            return b;
        }
    }
*/
    public static void mainP4(String[] args) {
        //求阶乘和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = 0;
        for (int i = 1; i <= n; i++) {

            ret += jc(i);
        }
        System.out.println(ret);
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static void mainP5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        if(n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
   /* public static void mainP6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        sum(a,b);
        sum(c,d);
    }*/
    /*public static int sum(int a,int b) {
        return max2(a,b);
    }
    public static double sum(double a,double b) {
        return max2(a,b);
    }*/

    //递归求 N 的阶乘
    public static void mainP7(String[] args) {
        int a = 10;
        System.out.println(digui(a));
    }
    public static int digui(int n) {
        int ret = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n+1; j++) {
                //求阶乘
                c *= i;
            }
            ret += c;
        }
        return ret;
    }


}
