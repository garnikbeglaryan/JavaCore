package homework10;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "He(l)lo (from) [Java";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}
