
import java.util.*;
abstract class Temperature {
    double temp;
    void setTempData(double temp) {
        this.temp = temp;
    }
    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;
    void changeTemp() { //@Override
        ctemp = (5.0 / 9.0) * (temp - 32);
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}

class Celsius extends Temperature {
    double ftemp;
    void changeTemp() { //@Override
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fahrenheit f = new Fahrenheit();
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        f.setTempData(fahrenheit);
        f.changeTemp();
        Celsius c = new Celsius();
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        c.setTempData(celsius);
        c.changeTemp();
    }
}


