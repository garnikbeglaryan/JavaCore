package homework7.practice;

public class PracticeHomeWork {


    long convert(int minutes) {
        minutes = minutes * 60;
        return minutes;
    }


    int calcAgain(int years) {
        years = years * 365;
        return years;
    }

    int nextNumber(int number) {
        number++;
        return number;
    }


    boolean isSameNum(int a, int b) {
        boolean count = false;
        if (a == b) {
            count = true;
        }
            return count;

    }

    boolean lessThanOrEqualToZero(int number) {
        boolean count = false;
        if(number < 0 || number == 0 ){
            count = true;
        }
            return count;

    }

    boolean reverseBool (boolean value) {
        return !value;
    }


    int  maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length){
            return array1.length;
        }else{
            return array2.length;
        }
    }

}
