package homework7.practice;

public class TestStack {

    public static void main(String[] args) {

        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        mystack1.push( 34);
        mystack1.push(12);
        mystack1.push(54);

        System.out.println(mystack1.pop());
        System.out.println(mystack1.pop());
        System.out.println(mystack1.pop());
        System.out.println(mystack1.pop());
    }
}
