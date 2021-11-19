package author;

import java.util.Scanner;

public class AuthorTest {


    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHORS = "1";
    private static final String SEARCH_AUTHORS = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";
    private static final String ADD_BOOKS = "5";
    private static final String PRINT_BOOKS = "6";
    private static final String SEARCH_BOOKS_BY_TITLE = "7";

    public static void main(String[] args) {
        authorStorage.add(new Author("poxos","poxosyan","poxosmail.ru",22,"male"));
        authorStorage.add(new Author("poxosuhi","poxosyan","poxosuhi@mail.ru",23,"femali"));
        authorStorage.add(new Author("martiros","martirosyan","martiros@mail.ru",25,"male"));
        boolean isRun = true;
        while (isRun) {
            printComands();
            String comand = scanner.nextLine();
            switch (comand) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHORS:
                    addAuthor();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOKS:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                    break;
                default:
                    System.out.println("invalid comand");
            }

        }

    }

    private static void searchByTitle() {
        System.out.println("please input keyword");
        String keword = scanner.nextLine();
        bookStorage.searchbytitle(keword);

    }

    private static void addBook() {
        System.out.println("title");
        String title = scanner.nextLine();
        System.out.println("desqription");
        String description = scanner.nextLine();
        System.out.println("price");
        double price = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("count");
        int count = Integer.parseInt(scanner.nextLine());

        bookStorage.add(new Book(title,description,price,count));
        System.out.println("Thank yow was aded");



    }


    private static void searchByAge() {
        System.out.println("pleas input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("pleas input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge ,maxAge);


    }

    private static void printComands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHORS + " for add author");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search by age");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + ADD_BOOKS + " for add books");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please unput " + SEARCH_BOOKS_BY_TITLE + " for search by title");

    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);

    }

    private static void addAuthor() {
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("surname");
        String surname = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("gender");
        String gender = scanner.nextLine();
        System.out.println("age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);
        System.out.println("Thank yow ,book was aded ");
    }
}

