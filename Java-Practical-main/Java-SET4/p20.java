class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void displayRectangle() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    public void displayCircle() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    public void displaySquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class p20 {
    public static void main(String[] args) {
        Square square = new Square();

        // Call methods from different classes
        square.displayShape();
        square.displayRectangle();
        square.displaySquare();
    }
}
