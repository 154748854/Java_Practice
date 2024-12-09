import java.util.Arrays;
import java.util.Scanner;


class Data {
//private int x;//用private修饰的成员变量只能在同包同类下才能使用
    public int x;
    public int y;

    public Data(int x,int y) {//同理，该构造方法也必须使用public修饰
       // x = x;//局部变量优先原则，所以需要加上this引用
        this.x = x;
        this.y = y;
    }

    public int getX() {//同理，这里不能使用private修饰方法
        return x;
    }

    public int getY() {
        return y;
    }
    }
public class Main {
    public static void main(String[] args) {

    }
public static void mainP2(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Data data = new Data(x,y);
        System.out.println(data.getX() + data.getY());
    }

}

    public static void mainP1(String[] args) {
        int[] array = new int[]{1,2,3};
        transform(array, array.length);
        System.out.println(Arrays.toString(array));
    }
    public static int[] transform(int[] array,int n) {
        for (int i = 0; i < n; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
