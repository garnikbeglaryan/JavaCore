package newhomework;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;

    }

    void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }


    int getbyindex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return -1;
        } else {
            return array[index];
        }

    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
    }
}