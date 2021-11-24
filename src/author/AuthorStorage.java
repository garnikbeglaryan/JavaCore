package author;

public class AuthorStorage {


    private Author[] authors = new Author[16];
    private int size;

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];

            }
        }
        return null;
    }

    public Book searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                System.out.println(authors[i].getBook());
            }
        }
        return null;
    }

    public void changeAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if(authors[i].getEmail().equals(email)){
                authors[i].setName("petros");
                authors[i].setSurname("petrosyan");


            }
        }
    }

    public void changeBookAuthor(String keword) {
        for (int i = 0; i < size; i++) {
            if(authors[i].getBook().getTitle().equals(keword)){

                System.out.println(authors[i].getBook());
//                authors[i].setEmail();
            }

        }
    }
}







