package homework6.arrayutil;

public class ArrayUtil {


    void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println();
        System.out.println("array-ի max = " + max);
    }

    int min1(int[] array) {
        int count = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < count) {
                count++;
            }

        }
        return  count;
    }

    void zuyger1(int[] array) {
        System.out.println();
        System.out.print("array _ի զույգերն են" + " ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
    }


    void zuyger(int[] array) {
        System.out.println();
        System.out.print("array2-ի զույգերն են" + " ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }
        }

    }

    void count1(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("array - ի զույգերի քանակն է " + count);
    }

    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("array2 -ի min = " + min);
    }


    void count(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;

            }
        }
        System.out.println("array-ի զուգերի քանակն է " + count);

    }

    void numbers(int[] array) {
        System.out.print("array - ի թվերն են" + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }

    void numbers2(int[] array) {
        System.out.println();
        System.out.print("arra2- ի թվերն են" + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
    }

    int max2(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    void sort(int[] array) {
        System.out.print("array մասսիվը մեծից — փոքր" + " ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    int count2(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
}



