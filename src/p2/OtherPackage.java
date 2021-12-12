package p2;

public class OtherPackage {

    OtherPackage(){
        p1.Protection p = new p1.Protection();

        System.out.println("n = " + p.n_pub);
    }
}
