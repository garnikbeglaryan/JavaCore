package homework12;

public class RefDemo {

    public static void main(String[] args) {

        BoxWeigth weigthbox = new BoxWeigth(3,5,7,8.37);
        Box plainbox = new Box();

        double vol;

        vol = weigthbox.volume();
        System.out.println(vol);
        System.out.println(weigthbox.weigth);

        plainbox = weigthbox;

        vol = plainbox.volume();
        System.out.println(vol);


    }

}
