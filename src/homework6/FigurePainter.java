package homework6;

public class FigurePainter {

    void figuerOne(int n,char c) {
            for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c +" ");

            }
            System.out.println();

        }

    }

    void figureTwo(int b, char d) {

        for (int i = 0; i < b; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(d + " ");
            }
            System.out.println();

        }
    }

    void figureThree(int e,char q) {
        System.out.println();
        for (int i = 0; i < e; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print(" #");

            }
            System.out.println();
        }

    }

    void figureFour(int z,char x) {
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");

            }

            for (int k = i; k < z; k++) {
                System.out.print(x + "$ ");

            }
            System.out.println();
        }
    }

    void figureFive(int y,char p) {

        for (int i = 0; i < y; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(p + "* ");

            }
            System.out.println();

        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = 4; j > i; j--) {
                System.out.print(p +"* ");

            }
            System.out.println();
        }

    }

}
