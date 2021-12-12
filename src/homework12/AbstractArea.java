package homework12;

public class AbstractArea {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,2);
        Rectangle figuref;

        figuref = rectangle;
        System.out.println(figuref.area());

    }
}
