class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side); 
    }
}

public class p19 {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(5.0, 3.0);
        shapes[1] = new Square(4.0);

        for (Rectangle shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println(); 
        }
    }
}
