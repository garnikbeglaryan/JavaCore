package author;

public class BookStorage {


    private Book [] books = new Book[10];
    private int size;


    public void add (Book book){
        if (books.length == size )
            extend();
        books[size ++ ] = book;
    }

    private void extend() {
        Book [] result = new Book[books.length + 10];
        for (int i = 0; i < books.length; i++) {
            result[i] = books[i];
        }
        books = result;

    }

    void print (){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
    }


    public void searchbytitle(String keword) {
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().contains(keword)){
                System.out.println(books[i]);
            }

        }
    }
}
