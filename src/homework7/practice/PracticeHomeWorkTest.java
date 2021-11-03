package homework7.practice;

public class PracticeHomeWorkTest {

    public static void main(String[] args) {


        PracticeHomeWork mynumbers = new PracticeHomeWork();
        int [] array1 = {4,6,12,34,5,2,8,22,36,10} ;
        int [] array2 = {9,5,14,12,31,55,78,90,2,3,1,7,8};
        System.out.println("1 minuts = " + mynumbers.convert(1) + " seconds");
        System.out.println("2 years = " + mynumbers.calcAgain(2) + " day");
        System.out.println("3 next number = " + mynumbers.nextNumber(3));
        System.out.println("6 is not equal 7 = " + mynumbers.isSameNum(6, 7));
        System.out.println("0 = 0 = "+ mynumbers.lessThanOrEqualToZero(0));
        System.out.println(mynumbers.reverseBool(false));
        System.out.println("the largest length has array2 = " + mynumbers.maxLength(array1,array2));
    }
}
