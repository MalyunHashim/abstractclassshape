package abstractclassshape;

import java.awt.geom.Area;

public class classtestabstraction {
    public static void main(String[] args) {
        shape T=new rectangle();
        shape S=new square();
        T.draw();
        S.draw();
        Area rectangle[]=new Area[4];
        rectangle[0]=new Area();
        rectangle[1]=new Area();
        rectangle[2]=new Area();
        rectangle[3]=new Area();



    }
}
