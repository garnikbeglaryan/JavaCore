package homework12;

public class BoxWeigth extends Box{

    double weigth;

//    BoxWeigth(double w,double h,double d, double m ){
//        width = w;
//        heigth = h;
//        depth = d;
//        weigth = m;
//
//    }

//    BoxWeigth(double w,double h, double d ,double m){
//        super (w,h,d);
//        weigth = m;
//
//    }

    BoxWeigth(BoxWeigth ob){
        super(ob);
        weigth = ob.weigth;

    }

    BoxWeigth (double w,double h, double d, double m){

        super(w,h,d);
        weigth = m;

    }

    BoxWeigth(){
        super();
        weigth = 1;

    }
    BoxWeigth(double len, double m){
        super(len);
        weigth = m;
    }
}
