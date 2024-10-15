
import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex c) {
        double newReal = this.real - c.real;
        double newImaginary = this.imaginary - c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex c) {
        double newReal = this.real * c.real - this.imaginary * c.imaginary;
        double newImaginary = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();
        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        scanner.close();
    }
}

