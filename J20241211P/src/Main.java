import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //给定一个大小为 n 的数组，找到其中的多数元素。
        // 多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        int[] array = new int[]{2,2,1,1,1,2,2};
        int ret = fun5(array);
        System.out.println(ret);

    }
    public static int fun5(int[] array) {
        int count = 1;
        int tem = array[0];
        for (int i = 0; i < array.length; i++) {
            if(tem == array[i]) {
                count++;
            }else {
                count--;
            }
            if (count <= 0) {
                tem = array[i];
            }
        }
    }

    public static void mainP4(String[] args) {
        //给定一个非空整数数组，除了某个元素只出现一次以外，
        // 其余每个元素均出现两次。找出那个只出现了一次的元素。
        int[] array = new int[]{4,5,5,6,6};
        int ret = fun4(array,array.length);
        System.out.println(ret);

    }
    public static int fun4(int[] array,int n) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret ^= array[i];//按位异或操作符就是找不同，当出现一样的数字时
            // ，结果全为零，就不会影响那个单独出现的数字
        }
        return ret;
    }
    public static void mainP3(String[] args) {
        //给定一个整数数组 nums 和一个整数目标值 target，
        // 请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ret = fun3(nums,target,nums.length);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] fun3(int[] array,int target,int n) {
        int[] ret = new int[]{0,1};
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i] + array[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }
    public static void mainP2(String[] args) {
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        int[] array = new int[]{1,2,3,4,5,6,7};
        int[] ret = fun2(array);
        System.out.println(Arrays.toString(ret));

    }
    public static int[] fun2(int[] array) {
        int i = 0;
        int j = array.length-1;
        while(i < j) {
            while (i < j && array[i]%2 != 0) {
                i++;
            }//这里走完i下标为偶数
            while (i < j && array[j]%2 == 0) {
                j--;
            }//这里走完j下标为奇数
            int tem = 0;
            tem = array[i];
            array[i] = array[j];
            array[j] = tem;
        }
        return array;
    }


    public static void mainP1(String[] args) {
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
        int[] array = new int[]{1,2,3,4,5,6};
        double ret = avg(array,array.length);
        System.out.println(ret);
    }
    public static double avg(int[] array,int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double ret = sum/n;
        return ret;
    }
}
