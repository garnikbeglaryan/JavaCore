package author;

public class AuthorStorage {
    Author[] array = new Author[10];
    int size = 0;

    void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    void extend() {
        Author[] result = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }


    Author getbyindex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return null;
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


