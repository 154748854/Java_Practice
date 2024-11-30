public class Test {

/*    public static void main(String[] args) {
        int a = 1;
        System.out.println(10 < 20 || a++ > 1);
        if(a++ > 1) {
            System.out.println("a+1了");
        }
        System.out.println(a);
    }*/
    public static void mainPractice2(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {//偶数
                sum -= 1.0/i;
            }else {//奇数
                sum += 1.0/i;
            }
        }
        System.out.println(sum);
    }
    public static void mainPractice1(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
