package dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;

    void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index" + index);

        } else {
            if (array.length == size) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];

            }
            array[index] = value;
            size++;
        }


    }

    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index" + index);

        }else{
            array[index] =value;
            size++;
        }
    }

    public boolean isempt () {
        if (size == 0){
            return true;
        }else {
            return false;
        }

    }

    public boolean iseExsit(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }





    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;

    }


    public int getbyindex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
            return -1;
        }
        return array[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);

        }
        System.out.println();
    }


    void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index " + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }

            size--;
        }

    }


}


