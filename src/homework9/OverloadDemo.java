package homework9;

public class OverloadDemo {

    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

//    void test(int a) {
//        System.out.println("a :" + a);
//    }

    void test(int a, int b) {
        System.out.println("a i b :" + a + " " + b);
    }

//    double test (double a){
//        System.out.println("double a :" + a);
//        return  a * a;
//    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове "
                + "test(douЬle) а:" + a);
    }

}
