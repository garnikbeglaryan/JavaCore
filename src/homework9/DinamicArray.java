package homework9;

public class DinamicArray {


    private int [] array = new int [10];
    private int size = 0;

    void add (int value) {
        if(array.length == size){
            extend();
        }
        array[size++]=value;
    }


    int getbyindex (int index){
        if (index<0 || index > size){
            System.out.println("invalid index");
            return -1;
        }
        return array[index];
    }




    void extend(){
        int [] result = new int[array.length +10];
        for (int i = 0; i < array.length; i++) {
            result[i]=array[i];
        }
        array = result;
    }

    void print (){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
}
