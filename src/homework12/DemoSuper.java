package homework12;

public class DemoSuper {

    public static void main(String[] args) {

        BoxWeigth mybox1 = new BoxWeigth(10,20,15,34.3);
        BoxWeigth mybox2 = new BoxWeigth(2,3,4,0.076);
        BoxWeigth mybox3 = new BoxWeigth();
        BoxWeigth mycube = new BoxWeigth(3,2);
        BoxWeigth myclone = new BoxWeigth(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weigth);


    }
}
