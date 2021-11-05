package homework8;


public class DynamicArray {


    private int[] array = new int[10];

    private int size = 0;


    public void add(int value) {
        System.out.print("Քցաց թիվն է  ");
        if (size == array.length) {
            extend();
        } else {
            System.out.println(array[size++] = value);
        }
    }


    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array = result;
        }
    }


    public int getbyindex(int index) {
        System.out.print("0-րդ ինդեքսի տակ = ");
        if (index < array.length) {
            return array[index];
        } else {
            index = -1;
            System.out.println("սահմանից դուրս է");
        }
        return array[index];
    }


    public void print() {
        System.out.print("Մասսիվի թվերն են =" + " ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");

        }

    }


}





