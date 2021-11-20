package newhomework;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();
        int [] array = {2,1,5,12,42,13,7,9,5,4};
        int [] array1= {3,5,6,2,12,13,43,55,7};

        au.print(array);
        au.max(array1);
        au.min(array);
        System.out.println(au.number(array1));
        System.out.println(au.numbers(array));
        au.sort(array1);
        System.out.println(au.mony(array1));
    }

}
