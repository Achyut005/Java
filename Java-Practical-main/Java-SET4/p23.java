interface Shape {
    void draw();
    String getColor();
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }

    
    public String getColor() {
        return color;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + ", and color " + color);
    }

    
    public String getColor() {
        return color;
    }
}

class Sign {
    private Shape background;
    private String text;

    public Sign(Shape background, String text) {
        this.background = background;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign text: " + text);
        System.out.println("Background color: " + background.getColor());
        background.draw();
    }
}

public class p23 {
    public static void main(String[] args) {
        Circle redCircle = new Circle(5.0, "red");
        Rectangle blueRectangle = new Rectangle(8.0, 6.0, "blue");

        Sign circleSign = new Sign(redCircle, "Welcome to the event!");
        Sign rectangleSign = new Sign(blueRectangle, "Important notice");

        circleSign.display();
        System.out.println();
        rectangleSign.display();
    }
}
