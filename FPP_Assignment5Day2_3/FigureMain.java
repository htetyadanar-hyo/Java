package FPP_Assignment5Day2_3;

//We can call the name by getClass().getSimpleName();

public class FigureMain {
    public static void main(String[] args) {
        Figure[] f = new Figure[5];
        UpwardHat uh = new UpwardHat("UpwardHat");
        uh.getFigure();
        DownwardHat dh = new DownwardHat("DownwardHat");
        dh.getFigure();
        FaceMaker fm = new FaceMaker("FaceMaker");
        fm.getFigure();
        Vertical v = new Vertical("Vertical");
        v.getFigure();
        System.out.println("");
        f[0]=uh;
        f[1]=uh;
        f[2]=dh;
        f[3]=fm;
        f[4]=v;
        for(Figure x: f) {
            //System.out.print(x);
            System.out.print(x.getClass().getSimpleName() + ": ");
            x.getFigure();
            System.out.println("");
        }
    }
}
