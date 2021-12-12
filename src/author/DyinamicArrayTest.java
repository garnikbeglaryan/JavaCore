package author;

public class DyinamicArrayTest {

    public static void main(String[] args) {


        DinamicArray da =new DinamicArray();


        da.add(5);

        int [] numbers = {22,33,44};
        da.add(numbers);
        da.print();

        da.add(12,2);
        da.print();

        da.set(7,3);
        da.print();


        System.out.println(da.isEmpty());

        System.out.println(da.isExsist(4));
    }
}
