package A3_conditional_loops;
import java.lang.Math;
import java.util.Scanner;
public class AreasVolumesAndPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Only available till a2 ,b2 and c2");
        System.out.println("__________MENU__________");
        System.out.println("a.Perimeter\n\t1.Equilateral Triangle\n\t2.Circle\n\t3.Parallelogram\n\t4.Rhombus\n\t5.Rectangle");
        System.out.println("b.Areas\n\t1.Equilateral Triangle\n\t2.Isosceles Triangle\n\t3.Parallelogram\n\t4.Rhombus\n\t5.Rectangle\n\t6.CSA cylinder\n\t7.TSA Cube");
        System.out.println("c.Volumes\n\t1.Cone\n\t2.Prism\n\t3.Cylinder\n\t4.Sphere\n\t5.Pyramid");
        System.out.println("Enter your choice code: ");
        char ch = in.next().charAt(0);
        int sch = in.nextInt();
        if(ch == 'a'||ch == 'b'||ch=='c' && sch < 7) {
            switch (ch) {
                case 'a' -> {
                    switch (sch) {
                        case 1 -> {
                            System.out.println("Enter the value of side: ");
                            double a = in.nextDouble();
                            System.out.println(peqTriangle(a));
                        }
                        case 2 -> {
                            System.out.println("Enter the value of radius: ");
                            double r = in.nextDouble();
                            System.out.println(pCircle(r));
                        }
                        default -> System.out.println("Not available, cuz I got lazy");
                    }
                }
                case 'b' -> {
                    switch (sch) {
                        case 1 -> {
                            System.out.println("Enter the value of side: ");
                            double a = in.nextInt();
                            System.out.println(eqtriangle(a));
                        }
                        case 2 -> {
                            System.out.println("Enter the value of side not equal to base: ");
                            double a = in.nextDouble();
                            System.out.println("Enter the value of base:");
                            double b = in.nextDouble();
                            System.out.println(isoscelesTriangle(a, b));
                        }
                        default -> System.out.println("Not available, cuz I got lazy");
                    }
                }
                case 'c' -> {
                    switch (sch) {
                        case 1 -> {
                            System.out.println("Enter the value of radius of base: ");
                            double r = in.nextDouble();
                            System.out.println("Enter the value of height");
                            double h = in.nextDouble();
                            System.out.println(vCone(r, h));
                        }
                        case 2 -> {
                            System.out.println("Not available too :(");
                        }
                        default -> System.out.println("Not available, cuz I got lazy");
                    }
                }
            }
        }else{
            System.out.println("Enter your Aadhar card no.: ");
            long a = in.nextLong();
            System.out.println("Enter your registered phone no.: ");
            long b = in.nextLong();
            System.out.println("Now, you must have received an OTP, yes Enter that:");
            long c = in.nextLong();
            System.out.println("Thank you for using this program");
        }
    }

    static double isoscelesTriangle(double a,double b){
        return 0.5*b*Math.sqrt(((a*a)-((b*b)/4)));
    }
    static double Parallelogram(double a, double h) {
        return a*h;
    }
    static double Parallelogram(double a,double b,double theta){
        return a*b*Math.sin(theta);
    }
    static double eqtriangle(double a){
        return (Math.sqrt(3)/4)*a*a;
    }

    static double pCircle(double r){
        return 2*3.14*r;
    }
    static double peqTriangle(double a){
        return 3*a;
    }
    static double pParallelogram(double a,double b){
        return 2*(a+b);
    }
    static double rhombus(double a){
        return 4*a;
    }
    static double vCone(double r,double h){
        return (1/3)*3.14*r*r*h;
    }
    static double vPrism(double b,double h){
        return b*h;
    }
    static double vCylinder(double r,double h){
        return 3.14*r*r*h;
    }
    static double vSphere(double r){
        return (4/3)*3.14*r*r*r;
    }
    static double vPyramid(double l,double w,double h){
        return (l*w*h)/3;
    }
    static double curvedsurfaceCylinder(double r, double h){
        return 2*3.14*r*h;
    }
    static double totalsurfaceCube(double s){
        return 6*s*s;
    }
}
