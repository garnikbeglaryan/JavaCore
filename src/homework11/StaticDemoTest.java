package homework11;

public class StaticDemoTest {

    public static void main(String[] args) {

        StaticDemo.collme();
        StaticDemo.a = 22;
        StaticDemo.collme();
        System.out.println("b =" + StaticDemo.b);
    }
}
