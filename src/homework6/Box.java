package homework6;


public class Box {



    double width;
    double height;
    double depth;


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double ien) {
        width = height = depth = ien;

    }


    double volume() {
        return width * height * depth;

    }

}



