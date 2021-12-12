package author2;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book getBySerialId(String serialId){
        for (int i = 0; i < size; i++) {
            if(books[i].getSerialId().equals(serialId)){
                return books[i];
            }
        }

        return null;
    }


    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searcByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }

        }
    }

    public void countByAuthor(Author author) {

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void delete(Book book) {
        for (int i = 0; i < size; i++) {
            if(books[i].equals(book)){
                deleteByIndex(i);
                break;
            }
        }

    }

    private void deleteByIndex(int index){
        for (int i = index +1; i < size; i++) {
            books[i-1] = books[i];

        }
        size--;
    }

    public void deleteByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                deleteByIndex(i);
            }
        }
    }
}