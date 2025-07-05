class Base {
    int a;
    public Base(int a) {
        a = this.a;
        System.out.println("A");
    }
}

class Derived extends Base{
    public Derived(int a) {
        super(a);
        System.out.println("B");
    }
}


public class Test {
    public static void main(String[] args) {
       // Derived derived = new Derived(10);
        String str = "hello world hello" ;
        String[] result = str.split(" ") ; // 按照空格拆分
        for(String s: result) {
            System.out.println(s);
        }
    }


    public static void main1(String[] args) {
        int x = 10;
        int y = 10;
        if (x == 10)
            if (y == 10)
                System.out.println("aaa");
            else
                System.out.println("bbb");
    }
}
