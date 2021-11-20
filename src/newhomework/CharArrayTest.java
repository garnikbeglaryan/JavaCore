package newhomework;

public class CharArrayTest {

    public static void main(String[] args) {

        CharArray text = new CharArray();
        char [] array ={'b', 'a', 'b', 'o', 'l', 'a'};
        char [] array1= {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        text.print(array);
        System.out.println(text.ly(array));
        System.out.println(text.bob(array));
        System.out.println(text.trim(array1));
        System.out.println(text.c(array));


    }
}
