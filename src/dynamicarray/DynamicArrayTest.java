package dynamicarray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();

        dy.add(5);

        int [] numbers = {33,44,55};
        dy.add(numbers);

        dy.print();

        dy.add(66,2);
        dy.set(22,2);
        dy.print();
        System.out.println(dy.isempt());
        System.out.println(dy.iseExsit(33));

    }
}
