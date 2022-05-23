import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Math.*;

/*public class laba1 {
    double a = 0.7;
    double b = 0.05;
    double x = 0.5;
    public static void main(String[] args) {

        laba1 prog = new laba1();
        prog.run();
    }

    private void run() {

        printCalculate();
        setABX();
        date();
    }

    void printCalculate() {

        System.out.printf("а: %.2f \nb: %.2f \nx: %.2f\n",a,b,x);
        calR(a,b,x);
        calS(a,b,x);
    }

    void setABX(){

        Scanner in = new Scanner(System.in);
        System.out.println("Ввeдіть значення а");
        double a = in.nextDouble();
        System.out.println("Ввeдіть значення в");
        double b = in.nextDouble();
        System.out.println("Ввeдіть значення х");
        double x = in.nextDouble();
        calR(a,b,x);
        calS(a,b,x);
    }

    void calR(double a, double b, double x) {

        System.out.printf("R = %.3f\n" ,(x*x*(x+1)/b - sin(x+a)*sin(x+a)));
    }

    void calS(double a, double b, double x) {

        System.out.printf("s = %.3f\n", (sqrt(x*b/a) + pow(cos((x+b)*(x+b)*(x+b)),2)));
     }
    void date() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Дата: " + dateFormat.format(new Date()));
    }
}*/


/*public class laba1 {

    public static void main(String[] args) {

        laba1 prog = new laba1();
        prog.run();
    }
    private void run() {

        printCalculate();
        setABX();
        date();
    }

    void printCalculate() {
        double x = 1.825;
        double y = 18.225;
        double z = -3.298;
        System.out.printf("x: %.3f \ny: %.3f \nz: %.3f\n",x,y,z);
        calC(x,y,z);
        calF(x,y,z);
    }


    private void date() {

        var format = DateTimeFormatter.ofPattern("HH:mm ' ' yyyy-MM-dd");
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.format(format));
    }

    void setABX(){

        Scanner in = new Scanner(System.in);
        System.out.println("Ввeдіть значення x");
        double a = in.nextDouble();
        System.out.println("Ввeдіть значення y");
        double b = in.nextDouble();
        System.out.println("Ввeдіть значення z");
        double x = in.nextDouble();
        calF(a,b,x);
        calC(a,b,x);
    }


    private void calF(double x, double y, double z) {

        double one = (y - x)*(y-z/(y-x));
        double two = 1 + pow(y - x,2);
        System.out.printf("F = %.3f\n", one/two);
    }

    private void calC(double x, double y, double z) {

        double one = pow(x,y/x);
        double two = pow(y/x,1./3);
        System.out.printf("C = %.3f\n", abs(one - two));
    }
}*/

public class laba1 {

    double x = 1.825;
    double y = 18.225;
    double z = -3.298;
    public static void main(String[] args) {

        laba1 prog = new laba1();
        prog.run();
    }
    private void run() {

        double f = calculateF(x,y,z);
        double c = calculateC(x,y,z);
        print(f,c);
        inputData();
        f = calculateF(x,y,z);
        c = calculateC(x,y,z);
        print(f,c);
        date();
    }

    private void print(double f, double c) {

        System.out.printf("x: %.3f \ny: %.3f \nz: %.3f\n",x,y,z);
        System.out.printf("C = %.3f\n", c);
        System.out.printf("F = %.3f\n", f);
    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввeдіть значення x");
        this.x = in.nextDouble();
        System.out.println("Ввeдіть значення y");
        this.y = in.nextDouble();
        System.out.println("Ввeдіть значення z");
        this.z = in.nextDouble();
    }


    private void date() {

        var format = DateTimeFormatter.ofPattern("HH:mm ' ' yyyy-MM-dd");
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.format(format));
    }

    private double calculateF(double x, double y, double z) {

        return  ((y - x)*(y - z/(y - x)))/(1+pow(y-x,2));
    }

    private double calculateC(double x, double y, double z) {

        return pow(x,y/x) - pow(y/x,1./3);
    }
}
