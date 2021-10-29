package homework6.arrayutil;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil myarray = new ArrayUtil();
        int[] array = {4, 6, 12, 24, 16, 17, 18, 45, 62, 47};
        int[] array2 = {2, 5, 8, 34, 55, 77, 99, 100, 12, 33,};
        myarray.numbers(array);
        myarray.numbers2(array2);
        myarray.zuyger1(array);
        myarray.zuyger(array2);
        myarray.max(array);
        System.out.println("array -ի min = " + myarray.min1(array));
        myarray.min(array2);
        myarray.count(array);
        System.out.println("array2 -ի max = " + myarray.max2(array2));
        myarray.sort(array);
        System.out.println(myarray.count2(array));


    }
}
