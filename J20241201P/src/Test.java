import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    }
    public static void mainP9(String[] args) {
        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
        // 可以重新输入，最多输入三次。三次均错，则提示退出程序
        Scanner scaner = new Scanner(System.in);
        String a = scaner.nextLine();
        String b = "12345@Qwer";
        System.out.println("请输入密码：");
        for (int i = 0; i < 3; i++) {
            if(a == b) {//emmm字符串不能这么比较，超纲了对我，此题放弃，以后再补

            }
        }
    }
    public static void mainP8(String[] args) {
        //输出一个整数的每一位
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        while (a != 0) {
            int b = a % 10;
            System.out.println(b);
            a /= 10;
        }
    }
    public static void mainP7(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        //获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。
        System.out.println(a+"的偶数位是：");
        for (int i = 0; i < 32; i+=2) {
            System.out.print((a >> i)&1);
        }
        System.out.println("\n");
        System.out.println(a+"的奇数位是：");
        for (int j = 1; j < 32; j+=2) {
            System.out.print((a >> j)&1);

        }
    }
    public static void mainP6(String[] args) {
        // 写一个函数返回参数二进制中 1 的个数
        int count = 0;
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        //1的二进制序列000000000000000000000001
        for (int i = 0; i < 32; i++) {
            if(((a >> i)&1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void mainP5(String[] args) {
        //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
        for (int i = 100; i <= 999; i++) {
            int m = i;
            int a  = m % 10;
            m /= 10;
            int b  = m % 10;
            m /= 10;
            int c  = m % 10;
            if(i == a*a*a + b*b*b + c*c*c) {
               System.out.println(i);//我简直就是天才！！！！天！！！才！！！啊！！！！！
            }
        }
    }
    public static void mainP4(String[] args) {
        //求两个正整数的最大公约数
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        System.out.println("a和b的最大公约数是：");
        for (int i = a; i > 0; i--) {
            if(a*1.0 % i == 0)  {
                for (int j = b; j > 0; j--) {
                    if(b*1.0 % j == 0 && i == j) {
                        System.out.println(i);
                        break;
                    }
                }//有没有办法只打印最大公约数啊┭┮﹏┭┮
            }
        }
    }
    public static void mainP3(String[] args) {
        //输出乘法口诀表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
    public static void mainP2(String[] args) {
        int count = 0;
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i < 2001; i++) {
            if(i % 4 == 0 && i % 100 != 0) {
                System.out.println(i);
                count++;
            }else if(i % 400 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void mainP1(String[] args) {
        //打印 1 - 100 之间所有的素数
        for (int i = 2; i <= 100; i++) {
            if(i == 2) {
                System.out.println(i);
            }
            for (int j = 2; j <= 100; j++) {
                if(i % j == 0) {
                    break;//余数为0就是不是素数，就跳出本次循环
                }else if(j == i-1) {
                    System.out.println(i);
                }
            }

        }
    }
}
