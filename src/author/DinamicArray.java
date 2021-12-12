package author;

public class DinamicArray {


    int[] array = new int[10];
    int size = 0;

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

    void add(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
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


    void set(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invaid index");
        } else {
            array[index] = value;

        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isExsist(int value) {
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }


    void extend () {
            int[] result = new int[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            array = result;
        }


        int getbyindex ( int index){
            if (index < 0 || index > size) {
                System.out.println("invalid index");
                return -1;
            } else {
                return array[index];
            }

        }


        void print () {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }


        void delete ( int index){

            if (index < 0 || index > size) {
                System.out.println("invalid index");
            } else {
                for (int i = index + 1; i < size; i++) {
                    array[i - 1] = array[i];
                }
                size--;
            }
        }
    }



