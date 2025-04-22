import java.util.*;
interface Volume {
    void displayVolume();
}

class Cone implements Volume {
    double radius, height;
    Cone(double r, double h) {
        radius = r;
        height = h;
    }
    public void displayVolume() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + volume);
    }
}

class Hemisphere implements Volume {
    double radius;
    Hemisphere(double r) {
        radius = r;
    }
    public void displayVolume() {
        double volume = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volume);
    }
}

class Cylinder implements Volume {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);}
}

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of Cone: ");
        double r1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        Volume cone = new Cone(r1, h1);
        System.out.print("Enter radius of Hemisphere: ");
        double r2 = sc.nextDouble();
        Volume hemisphere = new Hemisphere(r2);
        System.out.print("Enter radius and height of Cylinder: ");
        double r3 = sc.nextDouble();
        double h3 = sc.nextDouble();
        Volume cylinder = new Cylinder(r3, h3);
        cone.displayVolume();
        hemisphere.displayVolume();
        cylinder.displayVolume();
    }
}
