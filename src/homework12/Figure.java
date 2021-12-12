package homework12;

abstract class Figure {

    double dim;
    double dim1;

    Figure(double a, double b){

        dim = a;
        dim1 = b;

    }

    abstract double area();
}
