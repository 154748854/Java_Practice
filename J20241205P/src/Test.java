public class Test {
    public static void main(String[] args) {
        //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
        // 如果存在，请返回 true ；否则，返回 false
        int[] array = new int[]{2,6,4,1};
        System.out.println(trial(array, array.length));
    }
    public static boolean trial(int[] array,int n) {
        boolean flg = false;
        for (int i = 0; i < n-3; i++) {
            if(array[i] == array[i + 1]&& array[i] == array[i+2]) {
                flg = true;
            }else if(array[n] == array[n-1] && array[n] == array[n-2]) {
                flg = true;
            }else {
                flg = false;
            }
        }
        return flg;
    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void mainP6(String[] args) {
        int[] array = new int[]{4,1,2,1,2};
        for (int i = 0; i < array.length; i++) {
         boolean count = true;
            for (int j = 1; j < array.length; j++) {
                count = true;
                if(array[i] == array[j]) {
                    count = false;
                }
                if(count) {
                    System.out.println(array[i]);
                }
            }
        }
    }
    public static void mainP4(String[] args) {
        //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
        //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
        //示例 1：
        //输入：nums = [2,7,11,15], target = 9
        //输出：[0,1]
        //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
        int[] array = new int[]{2,7,11,15};
        int target = 9;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] + array[j] == target) {
                    System.out.println(i+" "+j);

                }
            }
        }
    }
    public static void mainP3(String[] args) {
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        //如数组：[1,2,3,4,5,6]
        //调整后可能是：[1, 5, 3, 4, 2, 6]
        int[] array = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            if((i+1) %2 != 0) {
                int tem = 0;
                tem = array[i];

            }
        }
    }
    public static void mainP2(String[] args) {
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
        int[] array = new int[]{1,2,3,4};
        System.out.println(avg(array, array.length));
    }
    public static double avg(int[] array,int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return (sum*1.0 / n);
    }
    public static void mainP1(String[] args) {
        //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
        // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        int[] array = new int[]{2,3,4};
        array = transform(array,array.length);
        for (int i = 0; i <= array.length-1; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] transform(int[] array,int n) {
        for (int i = 0; i <= n-1; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
